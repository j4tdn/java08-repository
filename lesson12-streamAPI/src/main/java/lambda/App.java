package lambda;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        // lambda : instance of Functional Interface



        // anonymous class


//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };

//        Runnable runnable  = () -> {
//            System.out.println("");
//        };
//
//        Function<String,Integer> functionn = (String str) -> new Integer(5);
//
//
//        BinaryOperator<String> bina = ( s1, s2) -> s1 ;
//
//        Comparator<String> cmp = Comparator.comparing(Function.identity());
//
//        List<String> items = List.of("x","yy","yz","t");
//
//
//        for(String item : items){
//            // external iteration
//        }
//
//      List<Integer> test =   items.stream().filter(item -> {
//            System.out.println("1 : " +item);
//            return item.contains("y");
//        }).map(item -> {
//            System.out.println("2 : " + item);
//            return item.length();
//        }).limit(1).distinct().collect(Collectors.toList());
//
//        test.forEach(t -> System.out.println("list item"+t));

        List<Integer> numbers = Arrays.asList(1,2,3,3,2,2,1,5);

        Map<Integer,Long> qtMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(qtMap);

        List<Map.Entry<Integer,Long>> qtNumber =  qtMap.entrySet().stream().filter(el -> el.getValue()== 1).collect(Collectors.toList());




        // anyMatch
        // findFirst
        // findAny
        // find ...


        // Optional
        //   method :
        //          + orElse
        //

        // Stream

//            Arrays.asList().stream().mapToInt() ;  => IntStream(); => khi nay thi ham max khong can tham so Comparator nua
            // IntStream, DoubleStream, LongStream, Primitive Stream

//         Stream<Integer> != IntStream();



        // unboxing ( tu doi tuong ve nguyen thuy )  , boxing ( tu nguyen thuy ve doi tuong )

        // Stream<Integer> IntegerStream ;

//        IntegerStream.mapToInt() => IntStream();

        // IntStream .boxed => Stream<Integer>



        //reducer : tong, tich, max, min , bcnn ,







    }
}
