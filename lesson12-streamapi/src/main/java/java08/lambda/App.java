package java08.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        //lambda is instance of Functional Interface
        //anonymous class
        //parameters
        // ->
        // {body}
        List<String> items = Arrays.asList("x", "yy", "zz", "t");
        items.forEach(System.out::println);

        items.stream().filter(x -> x.equals("x")).collect(Collectors.toList());

        //operation
        items.stream().filter(item -> {
            System.out.println("1: " + item);
            return item.contains("y");
        }).map(item -> {
            System.out.println("2: " + item);
            return item.length();
        }).collect(Collectors.toList());
    }


}

