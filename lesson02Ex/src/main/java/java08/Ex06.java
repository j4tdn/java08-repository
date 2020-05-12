package java08;

public class Ex06 {
    //Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
    public static void main(String[] args) {
        finalPrimeNumber();
    }

    private static void finalPrimeNumber() {
        int count = 0;

        for (int i = 0; count != 200; i++) {
            if (checkPrimeNumber(i)) {
                count++;
            }
            if (count == 200) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
