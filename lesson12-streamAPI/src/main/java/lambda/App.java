package lambda;


import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        Runnable runnable  = () -> {
            System.out.println("");
        };

        Function<String,Integer> functionn = (String str) -> new Integer(5);


        BinaryOperator<String> bina = ( s1, s2) -> s1 ;

        Comparator<String> cmp = Comparator.comparing(Function.identity());

        List<String> items = List.of("x","yy","yz","t");


        for(String item : items){
            // external iteration
        }

      List<Integer> test =   items.stream().filter(item -> {
            System.out.println("1 : " +item);
            return item.contains("y");
        }).map(item -> {
            System.out.println("2 : " + item);
            return item.length();
        }).limit(1).distinct().collect(Collectors.toList());
        
        test.forEach(t -> System.out.println("list item"+t));

    }
}
