package staticdemo;

public class Number {
    private int a;
    private static int b;

    public static void main(String[] args) {
        Number n1 = new Number();
        n1.a = 10;
        b = 99;
        System.out.println(n1.a);
        System.out.println(n1.b);

        int m = 5;
        int n = 9;
        System.out.println("sum: " + MathUtils.sum(m, n));
        System.out.println("sum: " + MathUtils.sub(m, n));
    }

    public int sum() {
        return 5 + 7;
    }

    public static int sub() {
        return 5 - 7;
    }
}
