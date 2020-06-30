package immutable;

import java.util.function.Consumer;

import utils.StringUtils;

public class Ex07SplitParsing {
	public static void main(String[] args) {
		String languages = "PHP   C ;   JAVA : React    Angular";
		String[] languageArray = languages.trim().split("[\\s;:]+");
		//anonymous class => anonymous function = lambda expression
		
		//lambda used to replace for an instance of Functional Interface
		//lambda has 3 parts
		//1.(parameters) = parameters in FI's abstract method
		//2. ->
		//3. body = body of FI's abstract method
		
		
		
		Consumer<String> consumer = (String language) -> {
			System.out.println(language);
		};
		
		StringUtils.forEach(languageArray, consumer);
		
		String replacedResult = languages.trim().replaceAll("[\\s;:]+", " ");
		System.out.println(replacedResult);
	}

}
