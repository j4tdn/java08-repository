package java08.immutable;

import java08.utils.StringUtils;

public class Ex03SL10 {
    public static void main(String[] args) {
        String s = "how are you ?";
        String s1 = "\nI'm great, thanks !";
        String s2 = "a";
        String s3 = "aBcD172#@";

        System.out.println(s.length());
        System.out.println(s.concat(s1));
        System.out.println(s.charAt(2));
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        System.out.println(s.indexOf(s2));
        System.out.println(s.lastIndexOf(s2));
        System.out.println("====================");

        StringCounter stringCounter= StringUtils.getCounter(s3);
        System.out.println(stringCounter);
    }
}
