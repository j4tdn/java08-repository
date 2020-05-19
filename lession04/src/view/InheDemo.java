package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SubClass;
import inheritance.test.SuperClass;

public class InheDemo {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Cat("Gray", false);
		a1.setColor("yellow");
		a1.setGender(true);
		System.out.println(a1.toString());
		System.out.println("================");
		System.out.println(a2.toString());
		System.out.println("================");
		Animal a3 = new Dog("While", false, "Underfined", true);
		a3.move();
		System.out.println(a3.toString());
		System.out.println("==============");
		SuperClass superClass = new SubClass();
		System.out.println("num : " + superClass.num);
		System.out.println("text : " + superClass.text);
		superClass.log();

		inheritance.iinterface.Animal a4 = new inheritance.iinterface.Cat();
		a4.Move();
		inheritance.iinterface.Animal a5 = new inheritance.iinterface.Dog();
		a5.Move();
	}
}
