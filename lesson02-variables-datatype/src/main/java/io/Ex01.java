package io;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      
      System.out.println("Enter full name:");
      String name = ip.nextLine();   
   
      
      System.out.print(" Enter age:");
      int age = Integer.parseInt(ip.nextLine());
      
      System.out.print(" Enter math:");
      float math = Float.parseFloat(ip.nextLine());
      
      System.out.println("Enter hobbies:");
      String hobbies = ip.nextLine();
      
      System.out.println("age:" + age);
      System.out.println("math:" + math);
      System.out.println("full name:" + name);
      System.out.println("hobbies:" + hobbies);
	}
}
