package view;

import inheritance.Animal;
import inheritance.Cat;
import inheritance.Dog;
import inheritance.test.SuperClass;

public class InheDemo {
	public static void main(String[] args) {
// muon khoi tao cat cos 2 cach
		Animal a1=new Cat();// a1 co pt cua animal
		// muon khoi tao gt cho a1= getset, constructor
		
		a1.setColor("yellow");
		a1.setGender(true);
		System.out.println(a1);
		System.out.println("===========");
		// vua ke thua object vua kt animal, ma ai gan hon thi ke thua
		
		Animal a2=new Cat("gray",false);
		System.out.println(a2);
		System.out.println("===========");
		// ham khoi tao: vo lop cha trc, roi moi vo lop con
		
		Animal a3=new Dog("white",false,"Undefined",true);
		a3.move();// ac/modi cua lop con rong hon lop cha
		System.out.println(a3);
		
		System.out.println("===============");
		SuperClass superclass= new SuperClass();
		System.out.println("num : "+superclass.num);
		System.out.println("test : "+superclass.test);// thuoc tinh lay cua ch, ham lay cua con
		superclass.log();
		// anonymous class
		inheritance.iinterface.Animal a4=new inheritance.iinterface.Cat();
		a4.move();
		
		//d ay la 1 lop an danh
		/*inheritance.iinterface.Animal a5=new inheritance.iinterface.Animal() {
			//day la 1 doi tuong
			public void move() {
				System.out.println("a5 is moving....... ");
				
			}
			
			public void eat() {
				System.out.println("a5 is eating....... ");
				// TODO Auto-generated method stub
				//......
			}
		};*/
		inheritance.iinterface.Animal a5=new inheritance.iinterface.Dog();
		a5.eat();
		//inter la bat buoc ke thua
		/* cha 
		 * + bat buoc
		 * => Abstract class: chua thang bat buoc va k bat buoc
		 * 
		 * 
        */
		
		
		
	}
	}
		
		
		
		
	

