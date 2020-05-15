package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Woman;

public class PolyDemo {
	public static void main(String[] args) {
		//Method
		int a = 10;
		int b = 20;
		
		double c = 30;
		double d = 40;
		
		System.out.println("Max: " + MathUtils.max(a, b));
		System.out.println("Max: " + MathUtils.max(a, b));
		System.out.println("Max:" + MathUtils.max(10, 5, 40));
		
		//Math.
		
		//Object
		Man man = new Man();
		//man.
		System.out.println("Man: " + man.getGender());
		
		Woman woman = new Woman();
		System.out.println("Woman: " + woman.getGender());
		
		//Hide the way to init an object
		//design pattern: (nha may, nha kho)factory pattern
		
		Person male = PersonFactory.get(Gender.MALE); //dung stack tham chieu den Man o heap, in ra Man
		System.out.println("Dung: " + male.getGender()); //male
		
		Person female = PersonFactory.get(Gender.FEMALE); //che dau khoi tao obj, khi runtime ko biet tro den ai
		System.out.println("Vu: " + female.getGender()); //female
		
		male = female;
		System.out.println("Male: " + male.getGender());
	}
}

// this: ham hien tai
//super: cha