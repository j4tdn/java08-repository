package immuatatble;

import java.util.function.Consumer;

import utils.StringUtils;

public class Ex07SplitParsing {
	public static void main(String[] args) {
		String languages = "   PHP C   ;  :JAVA React  Angular";

		String[] languageArray = languages.trim().split("[\\s;:]+"); // 1 den n khoang trang

		// anonymous class
		// anonymous function = lambda expression: bieu thuc lamda
		// su dung/ the hien nhu la 1 interface: co 1 ham truu tuong duy nhat
		// lambda co 3 phan
		// 1. danh sach tham so = so luong tham so trong phuong thuc truu tuong
		// interface (functional interface)
		// 2. ->
		// 3. body = body of FI's abstract method

		/*
		 * Consumer<String> consumer = (String language) -> {
		 * System.out.println(language); };
		 */

		StringUtils.forEach(languageArray, language -> System.out.println(language));
		String replaceResult = languages.trim().replaceAll("[\\s;:]+", " ");
		System.out.println("replaceResult: " + replaceResult);
	}
}
