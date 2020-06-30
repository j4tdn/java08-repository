package java08.immutable;

import java08.utils.StringUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;

public class Ex07SplitParsing {
    public static void main(String[] args) {
        String languages = "  PHP   ; C :   JAVA   React Angular";

        // split by 1-n spaces
        String[] languageArray = languages.trim().split("[\\s;:]+");

        /**
         * anonymous class => anonymous function
         * anonymous function = lambda expression
         * lambda used to replace for an instance of functional interface
         * lambda has 3 parts:
         * 1.(parameters) = parameters in FI's abstract method
         * 2. ->
         * 3. body = body of FI's abstract method
         * */

        Consumer<String> consumer = language -> System.out.println(language);

        StringUtils.forEach(languageArray, consumer);

        String replaceResult = languages.trim().replaceAll("[\\s;:]+", " ");
        System.out.println("replacedResult: " + replaceResult);
    }
}
