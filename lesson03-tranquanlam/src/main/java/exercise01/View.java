package exercise01;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap tam duong tron: ");
		Point o = new Point();
		System.out.print("Nhap 0x: ");
		o.setX(scanner.nextDouble());
		System.out.print("Nhap 0y: ");
		o.setY(scanner.nextDouble());
		System.out.println("Nhap ban kinh duong tron: ");
		System.out.print("Nhap r: ");
		double r = scanner.nextDouble();
		
		Circle circle = new Circle(o, r);
		
		System.out.println("Nhap diem a : ");
		Point a = new Point();
		System.out.print("Nhap Ax: ");
		a.setX(scanner.nextDouble());
		System.out.print("Nhap Ay: ");
		a.setY(scanner.nextDouble());
		
		System.out.println("A" + a.toString());
		System.out.println(circle.toString());
		
		if(circle.checkOnCircle(a)) {
			System.out.println("=>Diem A thuoc duong trong");
		}else {
			System.out.println("=>Diem A khong thuoc duong trong");
		}

	}

}
