package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.Woman;

public class PolyDemo {
	public static void main(String[] args) {
		//Method
		
		int a=10;
		int b=20;
		double c=30;
		double d=40;
		System.out.println("Max: "+ MathUtils.max(a, b));
		System.out.println("Max1: "+ MathUtils.max(c, d));
		System.out.println("Max2: "+ MathUtils.max(1,4,3,8,6,4));
		
		//object
		Person man = new Man();
		Person woman = new Woman();
		
		System.out.println("Man: "+ man.getGender());
		System.out.println("Woman: "+ woman.getGender());
		
		man=woman;
		System.out.println("Man: "+ man.getGender());
		
	}

}
