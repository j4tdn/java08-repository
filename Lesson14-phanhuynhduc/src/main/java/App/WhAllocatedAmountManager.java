package App;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
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

//        Map<Long, Integer> result = doAllocation(data, allocationAmount);
//        result.entrySet().forEach(System.out::println);
       Map<Long,BigDecimal> step1 =   fillingInMissingExpectedSales(getItems());

        callAllAmountKey(step1);
    }

    /**
     * Do warehouse allocation.
     *
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     *
     * @return map of storeId, storeAllocatedAmount
     */


    private static BigDecimal AllAmountLocated = bd(300) ;

    private static Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
        // TODO: do something
        return null;
    }

    private static Map<Long,BigDecimal> fillingInMissingExpectedSales(List<Store> storeList){

       Optional<BigDecimal> averageExpectedSalesOptinal =  storeList.stream().filter(store -> store.getSelected()).filter(store -> store.getExpectedSales() != null ).map(store-> store.getExpectedSales()).reduce((temp,number) -> (temp.add(number)).divide(BigDecimal.valueOf(2)));

       BigDecimal averageExpectedSales = averageExpectedSalesOptinal.orElse(BigDecimal.valueOf(0));
        System.out.println(averageExpectedSales);

       Map<Long,Store> longStoreMap =  storeList.stream().collect(Collectors.toMap(Store::getStoreId, store -> store));

       longStoreMap.entrySet().stream().forEach(store -> System.out.println(store.getKey() + "" + store.getValue()) );

//
     Map<Long,BigDecimal> step1 =  longStoreMap.entrySet().stream().collect(Collectors.toMap(entryStore -> entryStore.getKey(),entryStore -> {
//        return entryStore.getValue().getExpectedSales() != null ? entryStore.getValue().getExpectedSales() : entryStore.getValue().getReferenceStoreId() !=null ? longStoreMap.get(entryStore.getValue().getReferenceStoreId()).getExpectedSales() != null ? longStoreMap.get(entryStore.getValue().getReferenceStoreId()).getExpectedSales() : averageExpectedSales;
                 if (entryStore.getValue().getExpectedSales() != null) {
                     return entryStore.getValue().getExpectedSales();
                 }
                 if (entryStore.getValue().getReferenceStoreId() != null) {
                     if (longStoreMap.get(entryStore.getValue().getReferenceStoreId()).getExpectedSales() != null) {
                         return longStoreMap.get(entryStore.getValue().getReferenceStoreId()).getExpectedSales();
                     }
                     return averageExpectedSales;
                 }
                 return averageExpectedSales;
             }

     ));
//
//
//     step1.entrySet().stream().forEach( entryStore -> System.out.println(entryStore));



//        return null;
        return step1;

    }

    private static Map<Long,BigDecimal> callAllAmountKey(Map<Long, BigDecimal> expectedList){
            Optional<BigDecimal> sumExpectedSalesOptional = expectedList.entrySet().stream().map(entry -> entry.getValue()).reduce((temp, element) -> temp.add(element));
            BigDecimal sumExpectedSales = sumExpectedSalesOptional.isPresent() ? sumExpectedSalesOptional.get() : null;


        expectedList.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry ->  entry.getValue().divide(sumExpectedSales,10,RoundingMode.HALF_UP))).entrySet().stream().forEach( t -> System.out.println(t));

            return expectedList.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry ->  entry.getValue().divide(sumExpectedSales,10,RoundingMode.HALF_UP)));

    }

    private Map<Long,BigDecimal> calculationAmountKey(Map<Long,BigDecimal> allAmountKey){

       Optional<BigDecimal> AllStockPreviousDayOptional = getItems().stream().map(store -> store.getStorePreviousDay()).reduce((temp,currentElements) -> temp.add(currentElements));

       BigDecimal AllStockPreviousDay = AllStockPreviousDayOptional.orElse(bd(0));


        Map<Long,BigDecimal> fillingInMissingExpectedSales = fillingInMissingExpectedSales(getItems());

        Map<Long,BigDecimal> AllAmountKey = callAllAmountKey(fillingInMissingExpectedSales);

        Map<Long,Store> storeList = getItems().stream().collect(Collectors.toMap(store -> store.getStoreId(),store -> store));

        Map<Long,BigDecimal> amountLocated = storeList.entrySet().stream().collect(Collectors.toMap(entryStore -> entryStore.getKey(),entryStore -> {
                return AllAmountKey.get(entryStore.getKey()).multiply((AllAmountLocated.add(AllStockPreviousDay)).subtract(entryStore.getValue().getStorePreviousDay()));
        }));

        amountLocated.entrySet().stream().forEach( t-> System.out.println(t));


        return amountLocated;
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

