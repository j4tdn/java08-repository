package View;

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
		
		System.out.println("=============================");
		Animal a2 = new Cat("gray", false);
		System.out.println(a2);
		
		System.out.println("=============================");
		Animal a3 = new Dog("white", false, "underfined", true);
		System.out.println(a3);
		a3.move();
				
		System.out.println("=============================");
		SuperClass superClass = new SubClass();
		System.out.println("num : " + superClass.num);
		System.out.println("test : " + superClass.test);
		superClass.log();
		
		inheritance.iinterface.Animal a4 = new inheritance.iinterface.Cat();
		inheritance.iinterface.Animal a5 = new inheritance.iinterface.Dog();
		a4.move();
		a5.eat();
		
	}

}
