package lambda;

// anonymous class  = anonymous function = lambda ;
// using global var ( attribute ) with no restriction

// using local variable

public class LocalVariable {

    private static int b ;

    public static void main(String[] args) {
            test();
    }

    private static void test(){

        // local variable
         int a = 10 ;

        Runnable runnable = () -> {
            System.out.println(a);
           // a = 101 ;
            System.out.println(LocalVariable.b);
        };

        runnable.run();

    }
}
