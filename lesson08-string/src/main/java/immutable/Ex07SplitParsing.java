package immutable;

import java.util.function.Consumer;

import utils.StringUtil;

public class Ex07SplitParsing {
	public static void main(String[] args) {
		String languages = "   PHP ;   C: JAVA    React      Angular    ";
		
		// split by 1-n spaces
		String[] languageArray = languages.trim().split("[\\s;:]+");
		
		// anonymous class => anonymous function
		// anonymous function = lambda expression
		// lambda used to replace for an instance of Functional interface
		// just one function to override
		
		// lambda has 3 parts
		// 1. (parameters) = parameters in FI's abstract method
		// 2. ->
		// 3. body = body of FI's abstract method

		StringUtil.forEach(languageArray, language -> System.out.println(language));
		
		String replacedResult = languages.trim().replaceAll("[\\s;:]+", " ");
		
		System.out.println(replacedResult);
		
	}
}
