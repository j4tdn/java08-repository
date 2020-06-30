package immutable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex06Split {

	public static void main(String[] args) {
		String students = "LeNa-LeBi-LeLi-LeTi";
		String[] studentInfor = students.split("-", 2);
		
		System.out.println("Length: " + studentInfor.length);
		for (String infor : studentInfor) {
			System.out.println(infor);
		}
		
		System.out.println("========================");
//		String[] studentInforPattern = Pattern.compile("-").split(students);
//		System.out.println("Length: " + studentInforPattern.length);
//		for (String infor : studentInforPattern) {
//			System.out.println(infor);
//		}
		
		Stream<String> studentInforPattern = Pattern.compile("-").splitAsStream(students);
		studentInforPattern.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println("=>" + t);
				
			}
		});
		
		Consumer<String> consumer = new Consumer<String>() {

			public void accept(String t) {
				System.out.println("=>" + t);
				
			}
			};
		
		studentInforPattern.forEach(consumer);
		
	
	}
	private static void forEach(String[] students1, Consumer<String> consumer ) {
		for(String student : students1) {
			//will call accept method at runtime
            consumer.accept(student);
		}
	}
}

