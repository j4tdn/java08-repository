package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SubClass;
import inheritance.test.SuperClass;

public class InheDemo {
	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		
		
		
		a1.setColor("Yellow");
		a1.setGender(true);
		System.out.println(a1.toString());
		
		System.out.println("______________________________");
		
		Animal a2 = new Cat("Gray", false);
		
		System.out.println(a2);
		
		System.out.println("======================");
		
		Animal a3 = new Dog("white ", false , "undefined", true);
		
		
		
		System.out.println(a3);
		
		a3.move();
		
		
		SuperClass superClass  = new SubClass();
		
		System.out.println("num" +superClass.num);
		System.out.println("text :" +superClass.text);
		
		superClass.log();		
		
		
		inheritance.iinterface.Animal a4 = new inheritance.iinterface.Cat();
		
		a4.move();
		
//		inheritance.iinterface.Animal a5 = new inheritance.iinterface.Animal() {
//			
//			//anonymous class 
//			
//			@Override
//			public void move() {
//				
//				System.out.println("Dog is moving ");
//			}
//			
//			@Override
//			public void eat() {
//				System.out.println(" Dog is eating ");
//			}
//		};
		inheritance.iinterface.Animal dog = new inheritance.iinterface.Dog();
		
		dog.move();
	}
	
	
	// compile va runtime ( chu y ) 
}
