package collections.map;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex02 {

    public static void main(String[] args) {
        Map<Integer,String> modelMap = sort(mockData());

        // sort by property <K,V>
        // b1 : convert to Set<Entry<K,V>>
        // b2 : sort
        // b3 : transfers Set<Entry<K,V>> back to Map ;


        printf(modelMap);




    }


    private static Map<Integer,String> mockData(){
        Map<Integer,String> modelMap = new TreeMap<>();

        modelMap.put(43,"Da Nang");
        modelMap.put(92,"Quang Nam");
        modelMap.put(75,"Hue");
        modelMap.put(74,"Quang Tri");
        modelMap.put(73,"Quang Binh");
        return modelMap;
    }

    private static Map<Integer,String> sort(Map<Integer,String> modelMap){
        //b1
        Set<Map.Entry<Integer,String>> entrySet = modelMap.entrySet();

        //b2 :
        List<Map.Entry<Integer,String>> sortedList = new LinkedList<>(entrySet);
        sortedList.sort(Map.Entry.comparingByKey());
        /// co the gop lai mot buoc , b1 va b2 co the gop lai voi nhau

        // b3 :
        Map<Integer,String> sortedMap = new LinkedHashMap<>();

        // local variable va cai kha nang cua doi tuong cua lop anonymous class

        sortedList.forEach(entry -> sortedMap.put(entry.getKey(),entry.getValue()));
        return modelMap;
    }

    private static void printf(Map<Integer,String> modelMap){
        modelMap.entrySet().forEach(entry -> System.out.println(entry));
    }
    private static Map<Integer,String> sortUsingJava08(Map<Integer,String> modelMap){
        // A  a ; String:getMethod
        // a -> () : Consumer
        // () -> a : Suplier

        return modelMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e2,LinkedHashMap::new)) ;



    }

}
