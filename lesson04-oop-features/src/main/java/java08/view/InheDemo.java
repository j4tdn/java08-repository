package java08.view;

import java08.inheritance.Animal;
import java08.inheritance.Cat;
import java08.inheritance.Dog;
import java08.inheritance.test.SubClass;
import java08.inheritance.test.SuperClass;

public class InheDemo {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.setColor("Yellow");
        a1.setGender(true);
        System.out.println(a1);
        a1.move();
        System.out.println("=================");

        Animal a2 = new Cat("Gray", false);
        System.out.println(a2);

        System.out.println("=================");
        Animal a3 = new Dog("White", false, "Undefine", true);
        System.out.println(a3);

        System.out.println("=================");
        SuperClass superClass = new SubClass();
        System.out.println("num: " + superClass.num);
        System.out.println("text: " + superClass.text);
        superClass.log();

        System.out.println("=================");
        java08.inheritance.iinterface.Animal a4 = new java08.inheritance.iinterface.Cat();
        a4.move();
        java08.inheritance.iinterface.Animal a5 = new java08.inheritance.iinterface.Dog();
        a5.eat();

        System.out.println("=================");


    }
}
