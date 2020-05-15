package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Woman;

/*
 * 
 */
public class PolyDemo {
	public static void main(String[] args) {
		
		//Method
		int a = 10;
		int b = 20;
		
		double c= 30;
		double d =40;
		
		System.out.println(MathUtils.max(a, b));
		System.out.println(MathUtils.max(c, d));
		System.out.println(MathUtils.max(1, 5, 79, 3,7));
		
		//Object
		Man man = new Man();
		System.out.println("Man: \t"+man.getGender());
		
		Woman woman = new Woman();
		System.out.println("Woman: \t"+woman.getGender());//1:35, runtime, compile	1:49
		Person dung = PersonFactory.get(Gender.MALE);
		System.out.println("Dung:\t"+ dung.getGender());
		
		//how to ways to init an obejct
		Person male = PersonFactory.get(Gender.MALE);
		Person female = PersonFactory.get(Gender.FEMALE);
		male = female;
	}
}
