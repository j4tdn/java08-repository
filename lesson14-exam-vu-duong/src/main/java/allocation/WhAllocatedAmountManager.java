package allocation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
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

//		Map<Long, Integer> result = doAllocation(data, allocationAmount);
//		result.entrySet().forEach(System.out::println);

		var interplatedData = interpolatedExpectedSales(data);
		interplatedData.entrySet().forEach(x -> System.out.println(x.getValue()));

		System.out.println("=====================================");
		var allocatedKey = allocationKey(interplatedData);
		allocatedKey.entrySet().forEach(x -> System.out.println(x.getValue()));

		System.out.println("====================================");
		BigDecimal totalStockPreviousDay = data.stream().filter(x -> x.getSelected())
				.filter(x -> x.getExpectedSales() != null).map(Store::getExpectedSales)
				.reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
		System.out.println(totalStockPreviousDay);
		var amountAllocated = amountAllocated(allocatedKey, allocationAmount, totalStockPreviousDay);
		amountAllocated.entrySet().forEach(x -> System.out.println(x.getValue()));

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

	private static LinkedHashMap<Store, BigDecimal> interpolatedExpectedSales(List<Store> data) {

		List<Store> stores = data.stream().filter(x -> x.getSelected()).collect(Collectors.toList());

		var totalExpectedSales = stores.stream().filter(x -> x.getExpectedSales() != null).map(Store::getExpectedSales)
				.reduce(BigDecimal.ZERO, (a, b) -> a.add(b));

		Function<Store, BigDecimal> value = (Store t) -> {
			if (t.getExpectedSales() != null) {
				return t.getExpectedSales();
			} else if (t.getReferenceStoreId() != null) {
				var referenceStore = stores.stream().filter(x -> x.getStoreId() == t.getReferenceStoreId()).findFirst()
						.get();
				if (referenceStore != null && referenceStore.getExpectedSales() != null) {
					return referenceStore.getExpectedSales();
				}
			}

			return totalExpectedSales
					.divide(BigDecimal.valueOf(stores.stream().filter(x -> x.getExpectedSales() != null).count())
							.setScale(1, RoundingMode.HALF_UP));

		};

		return stores.stream()
				.collect(Collectors.toMap(Function.identity(), value, (o1, o2) -> o1, LinkedHashMap::new));

	}

	private static LinkedHashMap<Store, BigDecimal> allocationKey(
			LinkedHashMap<Store, BigDecimal> storeWithInterpolatedExpectedSales) {
//		final BigDecimal totalExpectedSalesInterpolated = storeWithInterpolatedExpectedSales.entrySet().stream()
//				.map(x -> x.getValue()).reduce(BigDecimal.ZERO, (a, b) -> a.add(b));

		List<BigDecimal> listInterpoltedSales = storeWithInterpolatedExpectedSales.entrySet().stream()
				.map(x -> x.getValue()).collect(Collectors.toList());

		BigDecimal tempTotal = BigDecimal.ZERO;
		for (BigDecimal number : listInterpoltedSales) {
			tempTotal = tempTotal.add(number);
		}

		final BigDecimal totalSale = tempTotal;

		Function<Entry<Store, BigDecimal>, BigDecimal> value = (Entry<Store, BigDecimal> t) -> t.getValue()
				.divide(totalSale, 10, RoundingMode.HALF_UP);

		return storeWithInterpolatedExpectedSales.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, value, (o1, o2) -> o1, LinkedHashMap::new));
	}

	private static LinkedHashMap<Store, BigDecimal> amountAllocated(
			LinkedHashMap<Store, BigDecimal> storeWithAllocationKey, final Integer allocationAmount,
			final BigDecimal totalStockPreviousDay) {
		Function<Entry<Store, BigDecimal>, BigDecimal> func = (Entry<Store, BigDecimal> t) -> {
			BigDecimal temp = totalStockPreviousDay.add(BigDecimal.valueOf(allocationAmount));

			BigDecimal temp2 = t.getValue().multiply(temp);

			return temp2.subtract(t.getKey().getStorePreviousDay());

		};

		return storeWithAllocationKey.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, func, (o1, o2) -> o1, LinkedHashMap::new));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

}
