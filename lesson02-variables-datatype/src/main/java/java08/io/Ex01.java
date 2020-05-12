package java08.io;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter fullname: ");
        String fullname = ip.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(ip.nextLine());

        System.out.print("Enter math: ");
        float math = Float.parseFloat(ip.nextLine());

        System.out.println("age: " + age);
        System.out.println("math: " + math);
        System.out.println("hobbies: " + fullname);

    }
}
