package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Woman;

public class PolyDemo {
	public static void main(String[] args) {
		// Method
		int a = 10;
		int b = 20;
		
		double c = 30;
		double d = 40;
		
		System.out.println("Max: " + MathUtils.max(a, b));
		System.out.println("Max: " + MathUtils.max(c, d));
		System.out.println("Max: " + MathUtils.max(1, 4, 6, 8, 5));
		
		// Object
		Man man = new Man();
		System.out.println("ToString " + man.getGender());
		
		Woman woman = new Woman();
		System.out.println("ToString " + woman.getGender());
		
		// da hinh trong doi tuong: la luc Runtime co the tro den object nay hoac kia
		// Hide the way to initial an object: de che dau, thay doi trong luc runtime
		// design pattern: factory pattern
		
		// new Man() duoc khoi tao luc Runtime
		Person male = PersonFactory.get(Gender.MALE);
		System.out.println("male: " + male.getGender());
		
		Person female = PersonFactory.get(Gender.FEMALE);
		System.out.println("female: " + female.getGender());
		
		male = female;
		System.out.println("\nmale: " + male.getGender());
		
	}
}
 