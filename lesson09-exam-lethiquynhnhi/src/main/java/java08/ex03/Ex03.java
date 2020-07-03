package java08.ex03;

import java.util.Random;

public class Ex03 {
    private static Random rd = new Random();

    public static void main(String[] args) {
        permutation("xyz");
    }

    private static void permutation(String s) {
        String[] chars = s.split("");


        for (int i = 0; i < chars.length; i++) {
            String permutation = "";
            for (int j = 0; j < chars.length - 1; j++) {
                String extention = "";
                for (int k = 0; k < chars.length; k++) {
                    int index = rd.nextInt(chars.length);
                    if (chars[index].equals(chars[i])) {
                        continue;
                    }
                    extention += chars[index];
                }

                System.out.println("permutation: " + extention);

            }

        }
    }


}
