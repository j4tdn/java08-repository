package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SubClass;
import inheritance.test.SuperClass;

public class InheDemo {

	public static void main(String[] args) {
		Animal cat1 = new Cat();
		cat1.setColor("Yellow");
		cat1.setGender(true);
		System.out.println(cat1);

		Animal cat2 = new Cat("Black", true);
		System.out.println(cat2);

		Animal dog1 = new Dog("black", true, "big bull", true);
		System.out.println(dog1);
		dog1.move();

		System.out.println("=================================");
		SuperClass superClass = new SubClass();
		System.out.println("num: " + superClass.num);
		System.out.println("text: " + superClass.text);
		superClass.log();
		System.out.println("=================================");
		inheritance.iinterface.Animal cat3 = new inheritance.iinterface.Cat();
		cat3.move();
		/*
		 * inheritance.iinterface.Animal cat4 = new inheritance.iinterface.Animal() {
		 * 
		 * // anonymous class
		 * 
		 * @Override public void move() { System.out.println("cat 4 is moving"); }
		 * 
		 * @Override public void eat() { System.out.println("cat 4 is eating"); } };
		 */
		inheritance.iinterface.Animal dog2 = new inheritance.test.Dog();
	}

}
