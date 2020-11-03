package collections.map;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex01 {
    // luu toan bo danh sach bien so xe
    // Tỉnh / Thành phố

    public static void main(String[] args) {
        Map<Integer,String> modelMap = new LinkedHashMap<>();
        modelMap.put(43,"Da Nang");
        modelMap.put(92,"Quang Nam");
        modelMap.put(75,"Hue");
        modelMap.put(74,"Quang Tri");
        modelMap.put(73,"Quang Binh");

        System.out.println("size" + modelMap.size());
        printf(modelMap);



       


        String danang = modelMap.get(43);
        String notFound = modelMap.getOrDefault(99,"Khong có nhé bạn nhe ");
        System.out.println(danang);
        System.out.println(notFound);

        String removed = modelMap.remove(75);
        System.out.println(removed);

    }

    private static void printf(Map<Integer,String> modelMap){


        // loop key
        // tai vi cai key la duy nhat nen khi tra ve se la mot Set
        Set<Integer> keySet = modelMap.keySet();


        // loop value
        Collection<String> valueCollection  = modelMap.values();
       valueCollection.forEach(t -> System.out.println("hello " +t));
        System.out.println(valueCollection.getClass());

        // loop entry
        Set<Map.Entry<Integer,String>> entrySet = modelMap.entrySet();

       List<Map.Entry<Integer,String>> dn = entrySet.stream().filter(entry -> entry.getValue().equals("Da Nang")).collect(Collectors.toList());
        dn.forEach(entry -> System.out.println(entry.getKey() + " " +entry.getValue()));

//        for(Map.Entry<Integer,String> entry : entrySet){
//
//            System.out.println("Entry" + entry);
//            System.out.println("Key" + entry.getKey());
//            System.out.println("Value" + entry.getValue());
//
//        }
    }


}
