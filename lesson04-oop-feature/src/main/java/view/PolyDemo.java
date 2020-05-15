package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Men;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Woman;

public class PolyDemo {
	public static void main(String[] args) {
		
		// Method
		int a = 10;
		int b = 20;

		System.out.println("Max: " + MathUtils.max(a, b));
		System.out.println("Max: " + MathUtils.max(a, b, 30));

		double c = 10.0;
		double d = 20.0;

		System.out.println("Max : " + MathUtils.max(c, d));
		
		
		// High the way to init an object
		// Design pattern: Factory Pattern
		Person men = PersonFactory.get(Gender.MALE);
		System.out.println("Men" + men.getGender());
		
		Person woman = PersonFactory.get(Gender.FEMALE);
		System.out.println("Woman: " + woman.getGender());
		
		// Thoi diem code la Compile: Person dung duoc compile. dung dc khai bao o Stack
		// Tai thoi diem Runtime dung o stack tro den new Man() o Heap
		Person dung = new Men();
		System.out.println(dung.getGender());
		
		Person nhi = new Woman();
		System.out.println(nhi.getGender());
				
	}
}
