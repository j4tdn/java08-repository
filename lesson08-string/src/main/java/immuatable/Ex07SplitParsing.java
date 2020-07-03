package immuatable;

import java.util.function.Consumer;

import utils.StringUtils;

public class Ex07SplitParsing {

	public static void main(String[] args) {
		String languages = "    PHP ;  C    Java     React    Angular  ";
		//split by 1-n spaces
//		String[] languageArray = language.trim().split("[\\s]{1,5}");
//		String[] languageArray = language.trim().split("[\\s]{1,}");
//		String[] languageArray = language.trim().split("\\s+");
		String[] languageArray = languages.trim().split("[\\s;:]+");
		
		//anonymous class ==> anonymous function  =  lambda expression
		//lambda used to replace for an instance function Interface
		//lambda has 3 parts
		//1. (parameters) = parameters in FI's abstract method
		//2. ->
		//3. body = body of FI's abstract method
		
		
		StringUtils.forEach(languageArray,  language -> System.out.println(language));
		
		String replacedResult = languages.trim().replaceAll("[\\s;:]+", " ");
		System.out.println(replacedResult);
	}

}
