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
		System.out.println(a1);
		
		System.out.println("==============================");
		Animal a2 = new Cat("Gray", false);
		System.out.println(a2);
		
		System.out.println("==============================");
		Animal a3 = new Dog("white", false, "Underfined", true);
		System.out.println(a3);
		a3.move();
		
		System.out.println("==============================");
		SuperClass superClass = new SubClass();
		System.out.println("num: "  + superClass.num);
		System.out.println("text: " + superClass.test);
		superClass.log();
		
		System.out.println("==============================");
		inheritance.iiterface.Animal a4 = new inheritance.iiterface.Cat();
		a4.move();
		
		System.out.println("==============================");
		inheritance.iiterface.Animal a5= new inheritance.iiterface.Animal() {
			
			// anonymous class
			
			@Override
			public void move() {
				System.out.println("a5 is moving");
			}
			
			@Override
			public void eat() {
				System.out.println("a5 is eating");
			}
		};
		a5.move();
	}
}
