package view;

//import org.graalvm.compiler.loop.MathUtil;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Woman;

public class PolyDemo {
	public static void main(String[] args) {

		// method
		int a = 10;
		int b = 20;

		double c = 30;
		double d = 40;
		System.out.println("Max:" + Math.max(a, b));
		System.out.println("Max:" + MathUtils.max(1, 2, 3, 4));

		// object
		Man man = new Man();
		System.out.println("toString:" + man.getGender());

		Woman woman = new Woman();
		System.out.println("toString:" + woman.getGender());
		
		Person dung = new Man();
		System.out.println("Dung:" +dung.getGender());
		
		Person Vu = new Woman();
		System.out.println("Dung:" +Vu.getGender());
  
		//hide the way to init an object
		//design pattern:
		Person male = PersonFactory.get(Gender.MALE);
		System.out.println("male:" +male.getGender());
		
		Person female =  PersonFactory.get(Gender.FEMALE);
		System.out.println("female:" +female.getGender());
		
		male = female;
		System.out.println("male:" + male.getGender());
		
		

	}
}
