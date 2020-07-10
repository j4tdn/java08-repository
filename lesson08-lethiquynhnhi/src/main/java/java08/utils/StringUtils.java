package java08.utils;

import java08.ex01.StringException;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    private static Scanner ip = new Scanner(System.in);

    private StringUtils() {
    }

    public static void forEach(String[] elements, Consumer<String> consumer) {
        for (String element : elements) {
            //will call accept method at runtime
            consumer.accept(element);
        }
    }

    public static boolean checkInputString(String s, String regexString) throws StringException {
        Pattern pattern = Pattern.compile(regexString);
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            throw new StringException("String don't allow to have number of special characters");
        }
        return true;
    }

    public static boolean checkInputStringName(String s, String regexString) throws StringException {
        Pattern pattern = Pattern.compile(regexString);
        Matcher matcher = pattern.matcher(s);

        if (!matcher.find()) {
            throw new StringException("String don't allow to have number of special characters");
        }
        return true;
    }

    public static String inputString(String patternString) {
        String s = "";
        do {
            System.out.print("Enter the string: ");
            try {
                s = ip.nextLine();
                if (StringUtils.checkInputString(s, patternString)) {
                    return s;
                }
            } catch (StringException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
