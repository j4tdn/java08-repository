package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SuperClass;

public class InheDemo {
	public static void main(String[] args) {
		
		Animal a1 = new Cat(); //a1: mau sac, gioi tinh, di chuyen, mau: null
	
		a1.setColor("Yellow");
		a1.setGender(true);
		System.out.println(a1); //toString vao Cat
		
		System.out.println("=============================");
		Animal a2 = new Cat("Gray", false);
		System.out.println(a2);
		System.out.println("=============================");
		
		//luc compile chua khoi tao gia tri
		Animal a3 = new Dog("white", false, "Undifined", true);//a3 la 1 tham chieu, runtime goi ham move trong Dog
		a3.move();
		System.out.println(a3);

		System.out.println("=============================");
		SuperClass superClass = new SuperClass();
		System.out.println("num: " + superClass.num);
		System.out.println("text: " + superClass.test);
		superClass.log();
		
		inheritance.iinterface.Animal a4 = new inheritance.iinterface.Cat(); //Cat la 1 Class
		a4.move();
		
		inheritance.iinterface.Animal a5 =  new inheritance.iinterface.Dog();
		a5.eat();
//		inheritance.iinterface.Animal a5 = new inheritance.iinterface.Animal() { //an danh
//			
////			public void move() {
////				System.out.println("a5 is moving");
////			}
////			
////			public void eat() {
////				System.out.println("a5 is eating");
////
////			}
//			
//		};
		
		
	}
}

//getClass load tai thoi diem runtime