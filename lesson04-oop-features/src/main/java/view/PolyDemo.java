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

		System.out.println("max: " + MathUtils.max(c, d));
		System.out.println("max: " + MathUtils.max(a, b));
		System.out.println("max: " + MathUtils.max(1, 2, 3, 5, 4));

		// Object
		// 1 doi tuong luc nay co the tro den doi tuong nay
		// luc khac tro den doi tuong khac

		Man man = new Man();
		System.out.println("Man: " + man.getGender());

		Woman woman = new Woman();
		System.out.println("Woman: " + woman.getGender());

		// Hide the way to init an object : che giau khoi cao doi tuong
		// Design pattern: Factory pattern : khoi tao doi tuong tu cha va chua biet ham
		// doi tuong khoi tao la ai
		/*
		 * Person dung = new Man(); System.out.println("Dung: " + dung.getGender());
		 * 
		 * Person vu = new Woman(); System.out.println("Vu: " + vu.getGender());
		 * 
		 * dung = vu; System.out.println("Dung: " + dung.getGender());
		 */

		Person person = PersonFactory.get(Gender.MALE);
		System.out.println("person: " + person.getGender());
		Person Vu = PersonFactory.get(Gender.FEMALE);
		System.out.println("vu: " + Vu.getGender());

	}

}