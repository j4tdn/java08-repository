package java08.collections.map;

import java.util.*;
import java.util.stream.Collectors;

public class Ex01 {

    //Biển số xe - Tỉnh/Thành phố
    public static void main(String[] args) {
        Map<Integer, String> modelMap = new HashMap<>();
        modelMap.put(43, "Đà Nẵng");
        modelMap.put(92, "Quảng Nam");
        modelMap.put(75, "Thừa Thiên Huế");
        modelMap.put(74, "Quảng Trị");
        modelMap.put(73, "Quảng Bình");

        String removed = modelMap.remove(75);
        System.out.println("removed value: " + removed);
        System.out.println("===========================");

        System.out.println("size: " + modelMap.size());
        printf(modelMap);
        System.out.println("===========================");

        // Tìm thành phố mã 43
        String f1 = modelMap.get(43);
        String f2 = modelMap.getOrDefault(99, "hihihi");

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
    }

    private static void printf(Map<Integer, String> modelMap) {
        //loop key
        Set<Integer> keys = modelMap.keySet();

        //loop value
        Collection<String> values = modelMap.values();
//        List<String> list = values.stream().collect(Collectors.toList());
        // loop entry
        Set<Map.Entry<Integer, String>> entrySet = modelMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Entry: " + entry);
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }

}
