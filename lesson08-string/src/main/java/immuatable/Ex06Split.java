package immuatable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Ex06Split {

	public static void main(String[] args) {
		String students="LeNa-LeTeo-HoangNa-HoangTeo-VanTeo";
		
		String[] studentinfor=students.split("-");
		
		System.out.println("Length: "+studentinfor.length);
		System.out.println("==============================");
		for(String infor:studentinfor) {
			System.out.println(infor);
		}
		 System.out.println("==============================");
		/* 
		 * String[] studentinforpatern=Pattern.compile("-").split(students); for(String
		 * infor:studentinforpatern) { System.out.println(infor); }
		 */
	     Stream<String> studentinforpatern=Pattern.compile("-").splitAsStream(students);
	     Consumer<String> consumer=new Consumer<String>(){

			public void accept(String t) {
				System.out.println(t);
				
			}
	     };
	     studentinforpatern.forEach(consumer);
	     foreach(studentinfor, consumer);
	}
	private static void foreach(String[] students,Consumer<String> consumer) {
		for(String student: students) {
			consumer.accept(student);
		}
		
	}

}
