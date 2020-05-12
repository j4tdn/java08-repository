package java08;

public class Ex02 {
    //Viết chương trình tính tổng S = 4! +7! + 12! + 18!
    public static void main(String[] args) {
        long sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
        System.out.println("sum: " + sum);
    }

    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
