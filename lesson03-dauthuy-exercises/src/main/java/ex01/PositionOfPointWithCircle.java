package ex01;

import java.util.Scanner;
import ex01.Distance;

public class PositionOfPointWithCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap toa do tam C: ");
		float x0 = sc.nextFloat();
		float y0 = sc.nextFloat();
		Coor C = new Coor(x0, y0);
		
		System.out.println("Nhap ban kinh R: ");
		float R = sc.nextFloat();
		
		System.out.println("Nhap toa do diem A: ");
		float xA = sc.nextFloat();
		float yA = sc.nextFloat();
		Coor A = new Coor(xA, yA);
		
		System.out.println("Toa do diem A: " + A);
		System.out.println("Tao do diem C: " + C);
		
		System.out.print("Vi tri diem A doi voi duong tron: ");
		Position(A, C, R);
		
	}
	
	public static void Position(Coor A, Coor C, float R) {
		if (Distance.distance(C, A, R) < R) {
			System.out.println("Diem A nam trong duong tron");
		}
		else if (Distance.distance(C, A, R) == R) {
			System.out.println("Diem A nam tren duong tron");
		}
		else {
			System.out.println("Diem A nam ngoai duong tron");
		}
	}
}
