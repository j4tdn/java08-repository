package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
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

		Map<Long, Integer> result = doAllocation(data, allocationAmount);
		// result.entrySet().forEach(System.out::println);
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
		// Step 1:
		Map<Long, BigDecimal> interpolateExpectedSalesMap = fillInMissingExpectedSales(data);
		System.out.println(interpolateExpectedSalesMap);

		return null;
	}

	// step 1: find interpolated expected sales
	private static Map<Long, BigDecimal> fillInMissingExpectedSales(List<Store> data) {
		Map<Long, BigDecimal> interpolateExpectedSalesMap = new HashMap<>();

		List<Store> selectedStores = data.stream().filter(store -> store.getSelected().equals(Boolean.TRUE))
				.collect(Collectors.toList());

		List<BigDecimal> ownExpectedSales = selectedStores.stream().map(Store::getExpectedSales)
				.filter(Objects::nonNull).collect(Collectors.toList());
		BigDecimal sum = ownExpectedSales.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal size = BigDecimal.valueOf(ownExpectedSales.size());

		BigDecimal avgOwnExpectedSales = sum.divide(size, 1, RoundingMode.HALF_UP);
		System.out.println("sum: " + sum);
		System.out.println("size: " + size);
		System.out.println("avgOwnExpectedSales: " + avgOwnExpectedSales);

		for (Store store : selectedStores) {
			BigDecimal interpolateExpectedSale = null;
			BigDecimal expectedSales = store.getExpectedSales();
			if (expectedSales != null) {
				interpolateExpectedSale = expectedSales;
			} else {
				Long refStoreId = store.getReferenceStoreId();
				if (refStoreId == null) {
					interpolateExpectedSale = avgOwnExpectedSales;
				} else {
					Optional<Store> optional = data.stream()
							.filter(storeData -> storeData.getStoreId().equals(refStoreId)).findFirst();
					Optional<BigDecimal> refStoreExpectedSalesOptional = optional.map(Store::getExpectedSales);
					interpolateExpectedSale = refStoreExpectedSalesOptional.orElse(avgOwnExpectedSales);
				}
			}

			interpolateExpectedSalesMap.put(store.getStoreId(), interpolateExpectedSale);
		}

		return interpolateExpectedSalesMap;
	}

	private static Map<Long, BigDecimal> calculationOfAllocationKey(List<Store> data) {
		Map<Long, BigDecimal> allocationKey = new HashMap<>();
		List<BigDecimal> dataAll = data.stream().map(Store::getExpectedSales).collect(Collectors.toList());
		BigDecimal sum = dataAll.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		
		 for (Map.Entry<Long, BigDecimal> entry : interpolateExpectedSalesMap.entrySet()) {
		        BigDecimal avg = entry.getValue().divide(sum, 10, RoundingMode.HALF_UP));
		    }
		 return allocationKey;
			
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

}