package Bai01;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Point a = new Point();
		Point o=new Point();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tọa độ điểm A: ");
		a.setX(sc.nextFloat());
		a.setY(sc.nextFloat());
		System.out.println("Nhập tọa độ tâm O: ");
		o.setX(sc.nextFloat());
		o.setY(sc.nextFloat());
		System.out.println("Nhập bán kính R: ");
		float r=sc.nextFloat();
		
		float dentx=Math.abs(a.getX()-o.getX());
		float denty=Math.abs(a.getY()-o.getY());
		
		float length= (float) Math.sqrt(dentx*dentx+denty*denty);
		if(length>r)
			System.out.println("Điểm A nằm ngoài đường tròn");
			
		else if(length<r) {
			
			System.out.println("Điểm A nằm trong đường tròn");
		}
		else
			System.out.println("Điểm A nằm trên đường tròn");
		

	}

}
