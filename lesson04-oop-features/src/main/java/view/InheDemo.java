package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SubClass;
import inheritance.test.SuperClass;

public class InheDemo {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.setColor("yellow");
		a1.setGender(true);
		System.out.println(a1);
		Animal a2 = new Cat("black", false);
		System.out.println(a2);
		System.out.println("=============================");
		Animal a3 = new Dog("white", true, "alaska", true);
		System.out.println(a3);
		a3.move();
		
		System.out.println("=============================");
		SuperClass superClass = new SubClass();
		System.out.println("num: " + superClass.num);
		System.out.println("text: " + superClass.text);
		superClass.log();
		System.out.println("=============================");
		//Do trung ten voi Animal o tren
		inheritance.iinterface.Animal a4 = new inheritance.iinterface.Cat();
		a4.move();
		/* inheritance.iinterface.Animal a5 = new inheritance.iinterface.Animal() {
			//anonymous class
			public void move() {
				System.out.println("a5 is moving");
				
			}
			
			public void eat() {
				System.out.println("a5 is eating");
				
			}
		};
		a5.eat();*/
		inheritance.iinterface.Animal a5 = new inheritance.iinterface.Dog();
		a5.eat();
		


	}

}