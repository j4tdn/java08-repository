package declaration;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex02 {
    public static void main(String[] args) {
        //Tim ra cac phan tu le trong mang
        int[] digits = {1, 7, 2, 9, 8, 12};
        int[] oddDigits = getOddDigits(digits);
        printf(oddDigits);
        System.out.println("=================");
        // 2nd way: stream
        int[] oddDigits2Nd = Arrays.stream(digits).filter(digit -> digit % 2 != 0).toArray();
        printf(oddDigits2Nd);

        // Call sum
        int sum = Arrays.stream(digits).filter(digit -> digit % 2 == 0).sum();
        System.out.println("sum: " + sum);

        //find max
        OptionalInt optionalMax = Arrays.stream(digits).filter(digit -> digit % 2 == 0).max();
        int max = optionalMax.orElse(0);
        System.out.println("max: " + max);


    }

    private static int[] getOddDigits(int[] digits) {
        int[] result = new int[digits.length];
        int rindex = 0;

        for (int digit : digits) {
            if (digit % 2 != 0) {
                result[rindex++] = digit;
            }
        }

        return Arrays.copyOfRange(result, 0, rindex);
    }

    private static void printf(int[] digits) {
        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}
