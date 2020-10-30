package lambda;


import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

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

    }
}
