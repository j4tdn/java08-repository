package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> linkedHasMap = new LinkedHashMap<>();

        linkedHasMap.put(1,"sdfdf");
        linkedHasMap.put(2,"sdfdsfd");

        linkedHasMap.forEach((key,value) -> {
            System.out.println(key +" " +value);
        });

    }
}

