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
		
		System.out.println("Max: "+MathUtils.max(a, b));
		System.out.println("Max: "+MathUtils.max(c, d));
		System.out.println("Max: "+MathUtils.max(1, 2,3,4,7));
		
		//object
		Man man=new Man();
		System.out.println("man: "+man.getGender());
		// che giau the hien cua object
		//
		Woman woman=new Woman();
		System.out.println("woman: "+woman.getGender());
		
		Person person=PersonFactory.get(Gender.MALE);
		System.out.println("person: "+person.getGender());
		Person Vu=PersonFactory.get(Gender.FEMALE);
		System.out.println("vu: "+Vu.getGender());
		person=Vu;
		System.out.println("peron:"+person.getGender());
		
		
		
		
	}
	

}
