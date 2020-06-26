package immutable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex06Split {
	public static void main(String[] args) {
		String students = "LeNa-LeTeo-HoangNa-VanTeo-LeTa";
		String[] studentInfo = students.split("-");		
		
		System.out.println("Length: " + studentInfo.length);
		for(String info : studentInfo) {
			System.out.println(info);
		}
		
		System.out.println("=========================");
	
//		String[] studentInfoPattern = Pattern.compile("-").split(students);
//		System.out.println("Length: " + studentInfoPattern.length);
//		for(String info : studentInfoPattern) {
//			System.out.println(info);
//		}
		
		Consumer<String> consumer = new Consumer<String>() {
			public void accept(String t) {
				System.out.println("-> " + t);
			}
		};
		
		Stream<String> studentInfoPattern = Pattern.compile("-").splitAsStream(students);
		studentInfoPattern.forEach(consumer);
		
		System.out.println("=========================");

		forEach(studentInfo, consumer);
	}
	
	private static void forEach(String[] students, Consumer<String> consumer) {
		for (String student : students) {
			// will call accept method at Runtime
			consumer.accept(student);
		}
	}
}
