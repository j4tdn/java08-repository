package java08.random;

import java.util.Random;

public class Ex03RandomPassword {
    private static Random rd = new Random();

    public static void main(String[] args) {
        String username = "admin";
        String password = "259";

        int i = 0;

        //find the way to attck the account
        String[] passwordInputs = new String[1000];  //fixed-length
        String passwordInput = "";
        while (!passwordInput.equals(password)) {
            //random password
            passwordInput = randomNumber(3);
            if (contains(passwordInputs, passwordInput)) {
                continue;
            }
            passwordInputs[i] = passwordInput;
            sleep(100);
            System.out.print(passwordInput + " ");
            i++;
            if (i != 0 && (i % 14 == 0)) {
                System.out.println();
            }
        }

        System.out.println("Login successful !");
    }

    private static String randomNumber(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += rd.nextInt(10);
        }
        return result;
    }

    private static void sleep(long seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }

    private static boolean contains(String[] elements, String input) {
        for (String element : elements) {
            if (element != null && element.equals(input)) {
                return true;
            }
        }
        return false;
    }
}
