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
		System.out.println("Max: " + MathUtils.max(1, 5, 4, 32, 2, 45, 5, 67));
		System.out.println("Max: " + MathUtils.max());
		System.out.println();

		// Oject
		Man man = new Man();
		System.out.println("Man: " + man.getGender());

		Woman woman = new Woman();
		System.out.println("Woman: " + woman.getGender());

		System.out.println();

		//factory pattern
		Person male = PersonFactory.get(Gender.MALE);
		System.out.println("Male: " + male.getGender());

		Person female = PersonFactory.get(Gender.FEMALE);
		System.out.println("Female: " + female.getGender());

		male = female;

		System.out.println("Male: " + male.getGender());
	}
}
