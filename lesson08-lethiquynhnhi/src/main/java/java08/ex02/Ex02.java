package java08.ex02;

import java08.ex01.StringException;

import java.util.Scanner;

public class Ex02 {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        String inputName = inputString();
        // String inputName = "heLlo wOrld JAvA08";

        String uppercaseLetterOfWord = uppercaseLetterOfWord(inputName);
        System.out.println(uppercaseLetterOfWord);
    }

    private static boolean checkName(String name) throws StringException {
        String regexString = "[a-zA-Z\\s]+";

        /*Pattern pattern = Pattern.compile(regexString);
        Matcher matcher = pattern.matcher(name);
        if (!matcher.find()) {
            throw new StringException("Name only has char characters!!!");
        }*/

        if (!name.matches(regexString)) {
            throw new StringException("Name only has char characters!!!");
        }
        return true;
    }

    private static String inputString() {
        String s = "";
        do {
            System.out.print("Enter the string: ");
            try {
                s = ip.nextLine();
                if (checkName(s)) {
                    return s;
                }
            } catch (StringException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private static String uppercaseLetterOfWord(String name) {
        String[] arrayString = name.trim().replaceAll("[\\s]+", " ").split("\\s");
        for (int i = 0; i < arrayString.length; i++) {
            String s = arrayString[i];
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()).toLowerCase();
            arrayString[i] = s;
        }
        return String.join(" ", arrayString);
    }
}
