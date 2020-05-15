package view;

import polymorphism.method.MathUtils;
import polymorphism.object.Gender;
import polymorphism.object.Man;
import polymorphism.object.Person;
import polymorphism.object.PersonFactory;
import polymorphism.object.Woman;

public class PolyDemo {
	public static void main(String[] args) {
		
		//Method demo
		
		int a = 10;
		int b = 20;
		System.out.println("Max : " +MathUtils.max(a,b));
		
		double c = 30 ;
		double d = 30 ;
		
		System.out.println(" Max : "+Math.max(a,b));
		System.out.println("Max : " +Math.max(c, d));
		System.out.println("Max : "+ Math.max(4.5, 6.9));
		
		// class Math cung vay 
		
		
		// Object Method 
		
		Man man = new Man();
		System.out.println("_______MAN___________");
		System.out.println("To String " +man.toString());
		System.out.println("get Gender\t" +man.getGender());
		
		Woman woman = new Woman();
		System.out.println("__________WOMMAN__________");
		System.out.println("To String "+woman.toString());
		System.out.println("get Gender\t" + woman.getGender());
		
		// Hide the way to init instance an object 
		// Design pattern : factory pattern
		
		Person male = PersonFactory.get(Gender.MALE);
		Person female = PersonFactory.get(Gender.FEMALE);
		
		
		//Person male = new Man();
		System.out.println("Male :" +male.getGender());
		
		//Person female = new Woman();
			
		System.out.println("Female :" +female.getGender());
		
		female = male;
		System.out.println(male.getGender());
		
		
		
	}
}
