package java08.ex05;

import java08.utils.StringUtils;

public class Ex05 {
    private static String PATTERN_STRING = "[A-Z]+";

    public static void main(String[] args) {
        /*String inputString1 = StringUtils.inputString(PATTERN_STRING);
        String inputString2 = StringUtils.inputString(PATTERN_STRING);*/
        String inputString1 = "ABHSDDDDJK";
        String inputString2 = "ABHASDDDJK";
        String result = theSameStrings(inputString1, inputString2);
        System.out.println(result);

    }

    private static String theSameStrings(String s1, String s2) {
        String longestString = "";
        String temp = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                temp = s1.substring(i, j);
                if ((temp.length() > longestString.length()) && s2
                        .contains(temp)) {
                    longestString = temp;
                }
            }
        }
        return longestString;
    }


}
