package java08.exercise;

import java08.utils.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {
        String input = "abcdecbfk";

        /**
         * char[] chars = input.toCharArray();
         // sort ascending
         Arrays.sort(chars);
         // sorted string
         input = String.valueOf(chars);
         String[] stringCounter = input.split("[az]+");
         StringUtils.forEach(stringCounter, counter -> {
         System.out.println(counter);
         });
         **/

        Map<Character, Long> map = input.chars().mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

        map.entrySet().forEach(entry->{
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        });

    }

}
