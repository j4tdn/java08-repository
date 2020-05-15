package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Woman;

public class PolyDemo {

	public static void main(String[] args) {
		//method
		int a=10;
		int b=20;
		
		double c=30;
		double d=40;
		System.out.println("Math : "+MathUtils.max(a, b));
		System.out.println("Math : "+MathUtils.max(c, d));
		System.out.println("Math : "+MathUtils.max(1,2,5,9));
		
		//object
	Man man =new Man();
	System.out.println("ToString: "+man.toString());
	System.out.println("man: "+man.getGender());
	
	Woman woman =new Woman();
	System.out.println("ToString: "+woman.toString());
	System.out.println("woman: "+woman.getGender());
	// da hinh: che giau di viec khoi tao doi tuong, cap nhat gia tri cua cac doi tuong cho nhau
	//design pattern: factory pattern
	Person male =PersonFactory.get(Gender.MALE);
	System.out.println("male: " +male.getGender());
	
	Person female =PersonFactory.get(Gender.FEMALE);
	System.out.println("female: " +female.getGender());
	
	male=female;
	System.out.println("male: " +male.getGender());
	

	}

}
