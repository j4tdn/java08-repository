package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SubClass;
import inheritance.test.SuperClass;

public class InheDemo {
	public static void main(String[] args) {
		Animal a1 = new Cat(); // a1 la 1 tham chieu, co nhung thuoc tinh cua Animal

		a1.setColor("Yellow");
		a1.setGender(true);

		System.out.println(a1); // Cat se duoc load luc runtime

		System.out.println("===========");
		Animal a2 = new Cat("Gray", false);
		System.out.println(a2);

		System.out.println("===========");
		Animal a3 = new Dog("White", false, "Undefined", true);
		a3.move();
		System.out.println(a3);

		System.out.println("===========");
		SuperClass superClass = new SubClass();

		System.out.println("num: " + superClass.num);
		System.out.println("num: " + superClass.text);
		superClass.log(); // khong dinh nghia lai thuoc tinh, chi dinh nghia lai phuong thuc

		System.out.println("===========");
		inheritance.iinterface.Animal a4 = new inheritance.iinterface.Cat();
		a4.move();

		System.out.println("===========");
		inheritance.iinterface.Animal a5 = new inheritance.iinterface.Dog();
		a5.eat();

		System.out.println("===========");
		
	}
}
