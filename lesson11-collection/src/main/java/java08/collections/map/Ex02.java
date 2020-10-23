package java08.collections.map;

import java.util.*;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        Map<Integer, String> sortedMap = sortUsingJava8(mockData());
        printf(sortedMap);

    }

    private static Map<Integer, String> mockData() {
        Map<Integer, String> modelMap = new TreeMap<>();
        modelMap.put(43, "Đà Nẵng");
        modelMap.put(92, "Quảng Nam");
        modelMap.put(75, "Thừa Thiên Huế");
        modelMap.put(74, "Quảng Trị");
        modelMap.put(73, "Quảng Bình");
        return modelMap;
    }

    private static void printf(Map<Integer, String> modelMap) {
        //loop key
        Set<Integer> keys = modelMap.keySet();

        //loop value
        Collection<String> values = modelMap.values();

        // loop entry
        Set<Map.Entry<Integer, String>> entrySet = modelMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Entry: " + entry);
        }
    }

    private static Map<Integer, String> sort(Map<Integer, String> modelMap) {
        // sort by property
        // B1: Convert to Set<Entry<K,V>>
        // B2: Sort
        //entrySet.stream().sorted(((o1, o2) -> o1.getKey().compareTo(o2.getKey())));
        // method reference
        //entrySet.stream().sorted(Comparator.comparing(Map.Entry::getValue));

        // only spend on for Entry type
        List<Map.Entry<Integer, String>> sortedList = new LinkedList<>(modelMap.entrySet());
        sortedList.sort(Map.Entry.comparingByKey());

        // B3: Transfers Set<Entry<K, V>> to Map<K, V>
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        sortedList.forEach(entry -> {
            sortedMap.put(entry.getKey(), entry.getValue());
        });
        return sortedMap;
    }

    private static Map<Integer, String> sortUsingJava8(Map<Integer, String> modelMap) {
        // () -> A: Supplier
        // a -> (): Consumer
        return modelMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }
}
