package baitap;

import java.util.Scanner;

public class PointOfCircle {
	public static void main(String[] args) {
		double Xr = InputData("Nhập hoành độ tâm R: Xr = ");
		double Yr = InputData("Nhập tung độ tâm R: Yr = ");
		double r = InputData("Nhập bán kinh R = ");
		double x = InputData("Nhập hoành độ điểm A: XA = ");
		double y = InputData("Nhập tung độ tâm R: YA = ");
		if(CheckPoint(Xr, Yr, x, y, r)) {
			System.out.println("Điểm A thuộc đường tròn!");
		}else {
			System.out.println("Điểm A không thuộc đường tròn!");
		}

	}

	private static boolean CheckPoint(double Xr, double Yr, double x, double y, double r) {
		if ((x - Xr) * (x - Xr) + (y - Yr) * (y - Yr) == r * r) {
			return true;
		} else {
			return false;
		}
	}
	
	private static double InputData(String s) {
		Scanner ip = new Scanner(System.in);
		System.out.println(s);
		double data = Double.parseDouble(ip.nextLine());
		return data;
	}

}
