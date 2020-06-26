package immuatable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex06Split {

	public static void main(String[] args) {
		String students = "LeNa-LeTeo-HoangNa-LeLa-LeLinh";
		String[] studentInfo = students.split("-");
		System.out.println("Lengthstudents " + studentInfo.length);
		for (String info : studentInfo) {
			System.out.println(info);
		}

		System.out.println("=============");
//		String[] studentPattern = Pattern.compile("-").split(students);
//		System.out.println("Length: " + studentInfo.length);
//		for (String info : studentPattern) {
//			System.out.println(info);
//		}

		Stream<String> studentSteams = Pattern.compile("-").splitAsStream(students);
//		studentSteams.forEach(new Consumer<String>() {
//
//			public void accept(String t) {
//				System.out.println("->" + t);
//
//			}
//		});
		
		Consumer<String> consumer = new Consumer<String>() {
			
			public void accept(String t) {
				System.out.println("--->"+ t);
			}
		};
		
		forEach(studentInfo, consumer);
	}
	
	private static void forEach(String[] students, Consumer<String> consumer) {
		for (String string : students) {
			consumer.accept(string);
		}
		
	}
}
