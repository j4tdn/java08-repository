package immuatable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex06Split {
	public static void main(String[] args) {
		String students = "LeNa-LeTao-HoangNa-VanTeo-LeTai";
		
		String[] els = students.split("-");
		
		String[] els2 = Pattern.compile("-").split(students);
		
		
		Stream<String> els3 = Pattern.compile("-").splitAsStream(students);
		
		els3.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println("-> " +t);
				
			}
		});
	
		
		
		
		
		
		System.out.println(els.length);
		
				
		for(String infor :els) {
			System.out.println(infor);
		}
		
		
		Consumer<String> cs = new Consumer<String>() {
			
			public void accept(String t) {
				t+= "++++++++";
				System.out.println("-> " +t );
				
			}
		};
		
		forEach(els, cs);
		
	}
	
	private static void forEach(String[] els, Consumer<String> consumer) {
		
		for(String el : els) {
			consumer.accept(el);
		}
		
		
	}
}
