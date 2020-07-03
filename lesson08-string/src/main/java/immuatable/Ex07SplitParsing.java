package immuatable;

import java.util.function.Consumer;

import utils.StringUtils;

public class Ex07SplitParsing {
	public static void main(String[] args) {
		String languages = "PHP C  JAVA React  :    Angular";
		
		//split by 1-n spaces
		String[] languageArray = languages.trim().split("[\\s;:]+"); //cat theo khoang trang
		
		//anonymous class: lop an danh => anunymous function
		//anunymous function = lamda expression
		//lamda used to replace for instance of Functional Interface: co ham 1 truu tuong duy nhat (FI)
		//lamda has 3 part:
		//1.parameters = parameter in FI's abstract method
		//2. ->
		//. body = body of FIs abstract method
		
		
		
//		Consumer<String> consumer = new Consumer<String>() {
//
//			public void accept(String language) {
//				System.out.println(language);
//			}
//		};
		
		StringUtils.forEach(languageArray, language -> System.out.println(language));
		
		String replacedResult = languages.trim().replaceAll("[\\s;:]+", " ");
		System.out.println("repacedResult: " + replacedResult);
	}
}

//trim(): cat phan tu thua 2 dau