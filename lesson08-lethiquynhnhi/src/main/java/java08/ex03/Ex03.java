package java08.ex03;

import java08.ex01.StringException;
import java08.utils.StringUtils;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {

    private static String PATTERN_STRING = "[0-9!@#$%^&*]+";

    public static void main(String[] args) {
//        String inputString = "Hôm nay trời nắng đẹp";
        String inputString = StringUtils.inputString(PATTERN_STRING);
        System.out.println("Input String: " + inputString);
        String newString = convertVietnameseToNormalString(inputString);
        System.out.println("New String: " + newString);

    }

    private static String convertVietnameseToNormalString(String s) {
        try {
            String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
            Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            Matcher matcher = pattern.matcher(temp);
            return matcher.replaceAll("").replaceAll("[\\s]+", "-").replaceAll("đ", "d");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
