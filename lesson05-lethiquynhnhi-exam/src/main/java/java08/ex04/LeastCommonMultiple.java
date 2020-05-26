package java08.ex04;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        System.out.println("BCNN: " + getLeastCommonMultiple(5, 7));
    }

    private static int getLeastCommonMultiple(int a, int b) {
        return (a * b) / getGreatestCommonDivisor(a, b);
    }

    private static int getGreatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
