package View;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Women;

public class PolyDemo {

	public static void main(String[] args) {
		// Method
		int a = 10;
		int b = 20;
		double c = 30;
		double d = 40;

		System.out.println("Max : " + MathUtils.max(a, b));
		System.out.println("Max : " + MathUtils.max(c, d));
		System.out.println("Max : " + MathUtils.max(30, 40, 50, 60));

		// Object
		Man man = new Man();
		System.out.println("Man: "+ man.getGender());
		Women women  = new Women();
		System.out.println("Women: "+ women.getGender());
		// doi tuong khoi tao luc runtime
		Person dung = new Man();
		//combine      runtime
		Person vu = new Women();

		//============================
		
		System.out.println("Dung :" + dung.getGender());
		System.out.println("Vu :" + vu.getGender());
		//Hide the way to init an object
		//design pattern : factory pattern
		Person male =  PersonFactory.get(Gender.MALE);
		//combine      runtime
		Person femail = PersonFactory.get(Gender.FEMALE);
		
		male = femail;
		
		System.out.println("Dung :" + male.getGender());
		System.out.println("Vu :" + femail.getGender());

	}

}
