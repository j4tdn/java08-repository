package utils;

import java.io.IOException;
import java.util.Scanner;

import bean.HinhTron;
import bean.Point;

public class HinhTronUtils {
	private  HinhTronUtils() {

	}
	public static Point nhapdiem() {
		double x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoành Độ: ");
		x= sc.nextDouble();
		System.out.println("Tung Độ: ");
		y= sc.nextDouble();
		Point diem = new Point(x,y);
		return diem;
	}
	
	public static HinhTron nhapht(){
		double r;
		System.out.println("Nhập tâm O của hình tròn: ");
		Point tamO = new Point();
		tamO = nhapdiem();
		System.out.println("Nhập bán kính của hình tròn: ");
		Scanner sc = new Scanner(System.in);
		r =sc.nextDouble();
		HinhTron ht = new HinhTron(tamO, r);
		return ht;
	}
	
	public static void check(double a, double r) {
		if (a < r) {
			System.out.println("Điểm A nằm bên trong đường tròn");
		}else if (a == r) {
			System.out.println("Điểm A nằm trên đường tròn");
		}else System.out.println("Điểm A nằm ngoài đường tròn");
		
	}
	public static double tinhKC(Point p1, Point p2) {
		double kc = 0;
		kc = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
		
		return kc;
		
	}
	
	
	
}	
