package java08.view;

import java08.polymorphism.method.MathUtils;
import java08.polymorphism.object.*;

public class PolyDemo {
    public static void main(String[] args) {
        // Method
        int a = 10;
        int b = 20;

        double c = 30;
        double d = 40;
        System.out.println("Max: " + MathUtils.max(a, b));
        System.out.println("Max: " + MathUtils.max(c, d));
        System.out.println("Max: " + MathUtils.max(1, 2, 3, 7, 4));

        // Object
        Man man = new Man();
        System.out.println("Man: " + man.getGender());

        Woman woman = new Woman();
        System.out.println("Woman: " + woman.getGender());

        // dung la mot tham chieu tren stack
        // Hide the way to init an object
        // design pattern: factory pattern
        Person dung = PersonFactory.get(Gender.MALE);
        System.out.println("Dung: " + dung.getGender());

        Person vu = PersonFactory.get(Gender.FEMALE);
        System.out.println("Vu: " + vu.getGender());

        vu = dung;
        System.out.println("Vu: " + vu.getGender());

    }
}
