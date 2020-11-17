package allocation;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhAllocatedAmountManager {
	
	/**
	    BigDecimal a = BigDecimal.valueOf(10);
	    BigDecimal b = BigDecimal.valueOf(20);
		BigDecimal mul = a.multiply(b);
		BigDecimal div = a.divide(b);
		BigDecimal add = a.add(b);
		BigDecimal sub = a.subtract(b);	
		a.setScale(10, RoundingMode.HALF_UP);
	 */
	
	public static void main(String[] args) {
		final List<Store> data = getItems();
		final Integer allocationAmount = 300;
		
		Map<Long, Integer> result = doAllocation(data, allocationAmount);
		result.entrySet().forEach(System.out::println);
	}

	/**
	 * Do warehouse allocation. 
	 * 
	 * Key: storeId with Long type 
	 * Value: storeAllocatedAmount after calculation with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
		//step 1
		BigDecimal sum = data.stream().map(Store::getExpectedSales).filter(Objects::nonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
		Stream<BigDecimal> stream = data.stream().filter(s -> s.getSelected()).map(s -> {
			if(s.getExpectedSales() == null) {
				Store s1 = data.stream().filter(st -> (st.getReferenceStoreId() != null)).findFirst().get();
				List<Store> filterStore = data.stream().filter(str -> (str.getExpectedSales() != null)).collect(Collectors.toList());
				if(s1.getExpectedSales() != null) {
					Store s2 = new Store(s1.getStoreId(), s1.getReferenceStoreId(), s1.getStorePreviousDay(), s1.getExpectedSales(), s1.getSelected());
				    s2.setExpectedSales(s1.getExpectedSales());  	
				    return s2.getExpectedSales();
				}
				else {
					Store s3 = new Store(s1.getStoreId(), s1.getReferenceStoreId(), s1.getStorePreviousDay(), s1.getExpectedSales(), s1.getSelected());
					BigDecimal interpolatedExpectedSale = sum.divide(BigDecimal.valueOf(filterStore.size()));
				    s3.setExpectedSales(interpolatedExpectedSale);	
				    return s3.getExpectedSales();
				}
			}
			else {
				return s.getExpectedSales();
			}
		});
		
		return null;
	}

	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), 
				new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), 
				new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), 
				new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), 
				new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), 
				new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}
	

}
