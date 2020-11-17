package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class WhAllocatedAmountManager {

    /**
     * BigDecimal a = BigDecimal.valueOf(10);
     * BigDecimal b = BigDecimal.valueOf(20);
     * BigDecimal mul = a.multiply(b);
     * BigDecimal div = a.divide(b);
     * BigDecimal add = a.add(b);
     * BigDecimal sub = a.subtract(b);
     * a.setScale(10, RoundingMode.HALF_UP);
     */

    public static void main(String[] args) {
        final List<Store> data = getItems();
        final Integer allocationAmount = 300;

//        Map<Long, Integer> result = doAllocation(data, allocationAmount);
//        result.entrySet().forEach(System.out::println);

        filledMissingExpectedSales(data).entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    /**
     * Do warehouse allocation.
     * <p>
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     *
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
        // TODO: do something
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

    private static Map<Long, BigDecimal> filledMissingExpectedSales(List<Store> datas) {
        BigDecimal sum = datas.stream()
                .map(Store::getExpectedSales)
                .filter(t -> t != null)
                .reduce((a, b) -> a.add(b))
                .orElse(BigDecimal.valueOf(0));

        BigDecimal size = BigDecimal.valueOf(datas.stream().filter(data->data.getExpectedSales() != null).count());

        Map<Long, BigDecimal> interpolateExpectedSales = new HashMap<>();

        for (int i = 0; i < datas.size(); i++) {
            Store store = datas.get(i);
            if (store.getExpectedSales() == null) {
                Optional<Store> refStoreOptional = findStoreById(datas, store.getReferenceStoreId());
                BigDecimal a = refStoreOptional.map(Store::getExpectedSales).orElse(sum.divide(size, 1, RoundingMode.HALF_UP));
                interpolateExpectedSales.put(store.getStoreId(), a);
            } else {
                interpolateExpectedSales.put(store.getStoreId(), store.getExpectedSales());
            }
        }
        return interpolateExpectedSales;
    }

    private static Optional<Store> findStoreById(List<Store> stores, Long id) {
        return stores.stream()
                .filter(store -> store.getStoreId().equals(id))
                .findFirst();
    }

}