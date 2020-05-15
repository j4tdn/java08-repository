package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.PersionFactory;
import polymorphism.object.Person;
import polymorphism.object.Woman;

public class PolyDemo {
	public static void main(String[] args) {

		// method

		int a = 10;
		int b = 20;

		double c = 30;
		double d = 40;
		System.out.println("max c & d" + MathUtils.max(c, d));
		System.out.println("max =" + MathUtils.max(a, b));
		System.out.println(MathUtils.max(3, 6, 8, 6, 9, 6));

		// Object

		// hide the way to init an object
		// design patten : factory patten
		Man man = new Man();
		System.out.println("toString : " + man.getGender());

		Person dung = PersionFactory.get(Gender.MALE);
		System.out.println("dung la : " + dung.getGender());

		Person vu = PersionFactory.get(Gender.FEMALE);
		System.out.println("vu la : " + vu.getGender());

		dung = vu;
		System.out.println("dung la la : " + dung.getGender());

	}
}
