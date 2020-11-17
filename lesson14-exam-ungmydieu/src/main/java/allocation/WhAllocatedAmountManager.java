package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
		// TODO: do something						
		Map<Long, Integer> step1 = data.stream().filter(t -> t.getSelected()).collect(Collectors.toMap(Store::getStoreId, getExpectedSale(data) ));
		
		return null;
	}
	
	private static BigDecimal getExpectedSale(Store store, List<Store> data) {
		if (store.getExpectedSales() != null) {return store.getExpectedSales();}
		else {
			Long referenceStoreId = store.getReferenceStoreId();
			if (referenceStoreId != null) {
				Store s = data.stream().filter(t -> (t.getStoreId() == referenceStoreId)).findFirst().get();
				if (s.getReferenceStoreId() != null) return s.getExpectedSales();
				else {
					return data.stream().map(Store::getExpectedSales).filter(Objects::nonNull)
						.reduce(BigDecimal.ZERO, BigDecimal::add);
				}
			}
		}
		return BigDecimal.ZERO;
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
