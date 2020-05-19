package view;

import Inferitance.test.SuperClass;
import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;

public class InheDemo {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.setColor("yellow");
		a1.setGender(true);
		System.out.println(a1);

		System.out.println("==============");
		Animal a2 = new Cat("Gray", false);
		System.out.println(a2);

		System.out.println("==============");
		Animal a3 = new Dog("White", false, "Undefine", true);
		a3.move();
		System.out.println(a3);

		System.out.println("==============");
		SuperClass superclass = new SuperClass();
		System.out.println("num:" + superclass.num);
		System.out.println("text:" + superclass.text);
		superclass.log();
		
		inheritance.iinerface.Animal a4 = new inheritance.iinerface.Cat();
		a4.move();
		inheritance.iinerface.Animal a5 = new inheritance.iinerface.Dog();
		a5.eat();
	}

}
