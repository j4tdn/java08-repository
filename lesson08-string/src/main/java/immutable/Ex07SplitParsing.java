package immutable;

import utils.StringUtils;

public class Ex07SplitParsing {
	public static void main(String[] args) {
		String languages ="  PHP   C; JAVA  :: React    ;: Angular   ";
		languages.trim();
		//split by 1-n spaces [\\s]{1,}
		String[]languageArrays = languages.split("[\\s;:]+");
		
		// anonymous class => anonymous function: 
		// anonymous function= lambda expression
		// Lambda is used to replace for an instance Functional interface
		//lambda has 3 part
		
		
		/*1. parameters = parameters in Functional Interface's abstract method
		 *2. ->
		 *3. body = body of FI's abstract method
		 */
		
		//inmutablleowr head, final: stack
		
		//Consumer<String> consumer = language ->	System.out.println(language);
		//StringUtils.forEach(languageArrays, language ->	System.out.println(language));
		String replace =languages.trim().replaceAll("[\\s;:]+", " ");
		System.out.println(replace);
	}
}
