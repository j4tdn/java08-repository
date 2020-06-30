package immutable;

import java.util.function.Consumer;

import utils.StringUtils;

public class Ex07SplitParsing {
	public static void main(String[] args) {
		String languages = "       PHP C   ; JAVA : REACT ANGULAR";

		String[] languageArray = languages.trim().split("[\\s:;]+");

		// Anonymous class => anonymous function
		// anonymous class = lambda express
		// lambda used to replace for an instance of Functional Interface
		// lambda has three parts
		// 1. Parameters = parameters in FI's abstract method
		// 2. ->
		// 3. body = body of FI's abstract method
		Consumer<String> consumer = language -> System.out.println(language);

		StringUtils.forEach(languageArray, consumer);
		
		String replaceResult = languages.replaceAll("[\\s:;]+", " ");
		
		System.out.println("replace result: " + replaceResult);
		
		
	}
}
