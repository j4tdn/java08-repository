package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SubClass;
import inheritance.test.SuperClass;

public class InheritanceDemo {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.setColor("Yellow");
		a1.setGender(true);
		System.out.println(a1);

		System.out.println("==========================");
		Animal a2 = new Cat("Gray", false);
		System.out.println(a2);

		System.out.println("==========================");
		Animal a3 = new Dog("White", false, "Undefined", true);
		System.out.println(a3);
		a3.move();

		System.out.println("==========================");

		SuperClass superClass = new SubClass();
		System.out.println("num: " + superClass.num);
		System.out.println("text" + superClass.text);
		superClass.log();

		System.out.println("===========================");
		inheritance.interfaceDemo.Animal a4 = new inheritance.interfaceDemo.Cat();
		a4.move();

		inheritance.interfaceDemo.Animal a5 = new inheritance.interfaceDemo.Dog();
		a5.move();

	}
}
