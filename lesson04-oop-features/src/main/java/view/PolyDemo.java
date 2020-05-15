package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Men;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Women;

public class PolyDemo {

	public static void main(String[] args) {
		
		//method
		int a = 10; 
		int b = 20;
		double c = 30;
		double d = 40;
		System.out.println("Max: " + MathUtils.max(a, b));
		System.out.println("Max: " + MathUtils.max(c, d));
		System.out.println("Max: " + MathUtils.max(1, 2, 3, 7, 4));
		
		//object
		//muc dich: 
		// + Hide the way to init an object
		// + Doi tuong nay co the tro toi doi tuong khac
		//design pattern: factory pattern
		Men man = new Men();
		Women woman = new Women();
		System.out.println("Gender: " + man.getGender());
		System.out.println("Gender: " + woman.getGender());
		
		/*
		Person tram = new Women();
		System.out.println("Tram: " + tram.getGender());
		Person tram2 = new Men();
		System.out.println("Tram2: " + tram2.getGender());
		tram = tram2;
		System.out.println("Tram: " + tram.getGender());
		*/
		Person tram = PersonFactory.get(Gender.FEMALE);
		System.out.println("Tram: " + tram.getGender());
		Person tram2 = PersonFactory.get(Gender.MALE);
		System.out.println("Tram2: " + tram2.getGender());
		tram = tram2;
		System.out.println("Tram: " + tram.getGender());
	}
	

}
