package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WhAllocatedAmountManager {

	/**
	 * BigDecimal a = BigDecimal.valueOf(10); BigDecimal b = BigDecimal.valueOf(20);
	 * BigDecimal mul = a.multiply(b); BigDecimal div = a.divide(b); BigDecimal add
	 * = a.add(b); BigDecimal sub = a.subtract(b); a.setScale(10,
	 * RoundingMode.HALF_UP);
	 */

	public static void main(String[] args) {
		final List<Store> data = getItems();
		final Integer allocationAmount = 300;

		List<Store> stores = getItems().stream().filter(t -> t.getSelected()).collect(Collectors.toList());
		fillingMissingValuesOfExpectedSales(stores);

		System.out.println(calculateAllocationKey(stores));

		Map<Long, Integer> result = doAllocation(data, allocationAmount);
		result.entrySet().forEach(System.out::println);
	}

	/**
	 * Do warehouse allocation.
	 * 
	 * Key: storeId with Long type Value: storeAllocatedAmount after calculation
	 * with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
		// TODO: do something
		return null;
	}

	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

	public static void fillingMissingValuesOfExpectedSales(List<Store> stores) {
		BigDecimal avg = stores.stream().map(Store::getExpectedSales).filter(s -> s != null)
				.reduce((temp, number) -> (temp.add(number)).divide(BigDecimal.valueOf(2))).orElse(BigDecimal.ZERO);

		stores.stream()
				.filter(t -> (t.getExpectedSales() == null && t.getReferenceStoreId() != null
						&& stores.stream().anyMatch(
								s -> s.getStoreId() == t.getReferenceStoreId() && s.getExpectedSales() == null)))
				.forEach(t -> t.setExpectedSales(avg.setScale(0, RoundingMode.HALF_UP)));

		Map<Long, BigDecimal> temp = stores.stream().filter(s -> s.getExpectedSales() != null)
				.collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));

		stores.stream()
				.filter(t -> t.getExpectedSales() == null && t.getReferenceStoreId() != null
						&& stores.stream().anyMatch(
								s -> s.getStoreId() == t.getReferenceStoreId() && s.getExpectedSales() != null))
				.forEach(t -> t.setExpectedSales(temp.get(t.getReferenceStoreId())));

	}

	public static Map<Long, BigDecimal> calculateAllocationKey(List<Store> stores) {
		BigDecimal sum = stores.stream().map(Store::getExpectedSales).reduce((a, b) -> a.add(b))
				.orElse(BigDecimal.ZERO);
		return stores.stream().collect(
				Collectors.toMap(Store::getStoreId, s -> s.getExpectedSales().divide(sum, 10, RoundingMode.HALF_UP)));
	}

	public static Map<Long, BigDecimal> CalculateAmountAllocated(Map<Long, BigDecimal> allocationKeys,
			List<Store> stores, Integer allocationAmount) {
		BigDecimal sum = stores.stream().map(Store::getStorePreviousDay).reduce((a, b) -> a.add(b))
				.orElse(BigDecimal.ZERO);
		Map<Long, BigDecimal> result = new HashMap<Long, BigDecimal>();
		for (Store store : stores) {
			long id = store.getStoreId();
			result.put(id, allocationKeys.get(id).multiply(sum.add(BigDecimal.valueOf(allocationAmount))));
		}
		return result;
	}

}
