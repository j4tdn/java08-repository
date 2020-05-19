package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SubClass;
import inheritance.test.SuperClass;

public class InhDemo {

	public static void main(String[] args) {
		Animal a1=new Cat();
	
		a1.setColor("Yelow");
		a1.setGender(true);
		System.out.println(a1);
		
		System.out.println("=====================");
		Animal a2=new Cat("Gray",false);
		System.out.println(a2);
		
		System.out.println("======================");
		Animal d1=new Dog("White",false,"Undefined",true);
		d1.move();
		System.out.println(d1);
		
		System.out.println("======================");
		SuperClass superclass=new SubClass();
		System.out.println("num :"+superclass.num);
		System.out.println("text:"+superclass.text);
		superclass.log();
		inheritance.iinterface.Animal a4= new inheritance.iinterface.Cat();
		a4.move();
		System.out.println("===================");
		inheritance.iinterface.Animal a5=new inheritance.iinterface.Dog();
		a5.eat();
	}

}
