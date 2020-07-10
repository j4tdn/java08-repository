package java08.ex01;

import java08.utils.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class Ex01 {

    private static String PATTERN_STRING = "[0-9!@#$%^&*]+";

    public static void main(String[] args) {
        String inputString = StringUtils.inputString(PATTERN_STRING);
//        String inputString = "hello     java08";

        System.out.println("Each char lies one line: ");
        printChar(inputString);
        System.out.println("========================");
        System.out.println("Each word lies one line: ");
        printWord(inputString);

        System.out.println("========================");
        System.out.println("Each reverse char lies one line: ");
        printReverseChar(inputString);

        System.out.println("========================");
        System.out.println("Each reverse word lies one line: ");
        printReverseWord(inputString);
    }

    private static void printChar(String s) {
        s = s.trim().replaceAll("[\\s]+", "");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    private static void printReverseChar(String s) {
        s = s.trim().replaceAll("[\\s]+", "");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }

    private static void printWord(String s) {
        Consumer<String> consumer = language -> System.out.println(language);
        String[] arrayString = s.trim().replaceAll("[\\s]+", " ").split("\\s");
        StringUtils.forEach(arrayString, consumer);
    }

    private static void printReverseWord(String s) {
        String[] arrayString = s.trim().replaceAll("[\\s]+", " ").split("\\s");
        Arrays.asList(arrayString).stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
