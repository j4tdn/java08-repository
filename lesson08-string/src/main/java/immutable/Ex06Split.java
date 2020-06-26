package immutable;

import java.util.function.Consumer;
import java.util.regex.Pattern;

public class Ex06Split {

	public static void main(String[] args) {
		String students = "LeNa-LeTeo-HoangNa-VanTeo-LeTa";

		String [] studentInfo = students.split("-");
		System.out.println("Length : " + studentInfo.length);
		for(String info:studentInfo) {
			System.out.println(info);
		}
		
		System.out.println("================================");
		
		/*
		String[] studentInfoPattern = Pattern.compile("-").split(students);
		for(String info:studentInfoPattern) {
			System.out.println(info);
		}
		*/
		
		/*
		Pattern.compile("-")
				.splitAsStream(students).forEach(new Consumer<String>() {

					@Override
					public void accept(String t) {
						System.out.println("-> " + t);
					}
		});
		*/
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("-> " + t);				
			}
		};
		
		forEach(studentInfo, consumer);
		

		
	}
	
	private static void forEach(String[] students, Consumer<String> consumer) {
		for(String student:students) {
			consumer.accept(student);
		}
	}
}
