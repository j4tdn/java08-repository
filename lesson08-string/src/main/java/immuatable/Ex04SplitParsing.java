package immuatable;

import utils.StringUtils;

public class Ex04SplitParsing {
	public static void main(String[] args) {

		String languages = "PHP  ,  JAVA  ::: React ;;; Angular  ";

		String[] languageArray = languages.trim().split("[\\s;:,]+");

		// anonymous class => anonymous function
		// anonymous function => lambda expression
		// lambda used to replace for an instance of functional interface
		// lambda has 3 parts
		// 1. parameters = parameters in FI's abstract method
		// 2. ->
		// 3. body = body of FI's abstract method

		StringUtils.forEach(languageArray, language -> System.out.println(language));

		String replaceResult = languages.trim().replaceAll("[\\s;:,]+", " ");
		
		System.out.println(replaceResult);
	}
}
