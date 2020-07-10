package java08.ex04;

public class Ex04 {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 60;
        String arrayPrimeNumber1 = arrayPrimeNumber(number1);
        String arrayPrimeNumber2 = arrayPrimeNumber(number2);

        boolean checkEquivalentPrimeNumber = checkEquivalentPrimeNumber(arrayPrimeNumber1, arrayPrimeNumber2);
        if (checkEquivalentPrimeNumber) {
            System.out.println("==> Yes");
        } else {
            System.out.println("==> No");
        }

    }

    private static boolean checkEquivalentPrimeNumber(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

    private static String arrayPrimeNumber(int number) {
        String arrayPrimeNumber = "";
        for (int i = 2; i < number; i++) {
            if (checkPrimeNumber(i) && number % i == 0) {
                arrayPrimeNumber += (char) i;
            }
        }
        return arrayPrimeNumber;
    }

    private static boolean checkPrimeNumber(int number) {
        if (number == 0 || number == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
