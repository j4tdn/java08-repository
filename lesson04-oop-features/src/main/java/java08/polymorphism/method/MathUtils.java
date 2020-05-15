package java08.polymorphism.method;

public class MathUtils {
    private MathUtils() {
    }

    /**
     * Overloading:
     * + Belong to one class
     * + Same name
     * + Different:
     * . Number of parameters
     * . Data type of parameters
     * . Return type
     */

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        //  return (a > b ? a: b) > c ? (a > b ? a: b) : c;
        return max(max(a, b), c);
    }

    public static int max(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("IndexOutOfBoundException");
            return Integer.MIN_VALUE;
        }
        int max = numbers[0];
        for (int num : numbers) {
            /*if(max < num){
                max = num;
            }*/
            max = max(max, num);
        }
        return max;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }
}
