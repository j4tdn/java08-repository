package java08.lambda;

public class LocalVariable {
    // anonymous class = anonymous func = lambda
    // using global var(attribute) no restriction
    // using local var
    private static int b = 100;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        // local variable
        final int a = 10;
        Runnable runnable = () -> {
//            a =100;
            System.out.println("a: " + a);
            b = 10;
            System.out.println("b: " + b);
        };
        runnable.run();
    }
}
