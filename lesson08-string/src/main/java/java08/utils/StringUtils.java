package java08.utils;

import java08.immutable.StringCounter;

import java.util.function.Consumer;

public class StringUtils {

    private StringUtils(){}

    public static StringCounter getCounter(String s){
        int countLowerChars = 0;
        int countUpperChars = 0;
        int countDigits = 0;
        for(int i =0 ; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                countLowerChars++;
            }
            if(Character.isUpperCase(s.charAt(i))){
                countUpperChars++;
            }
            if(Character.isDigit(s.charAt(i))){
                countDigits++;
            }
        }
        return new StringCounter(countLowerChars, countUpperChars, countDigits);
    }

    public static void forEach(String[] elements, Consumer<String> consumer){
        for(String element :elements){
            //will call accept method at runtime
            consumer.accept(element);
        }
    }
}
