package view;

import java.util.Scanner;

import Utils.PointUtils;
import bean.Point;

public class Bai1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap toa do tam duong tron: ");
		int x0 = sc.nextInt();
		int y0 = sc.nextInt();
		Point O = new Point(x0, y0);

		System.out.println("nhap ban kinh");
		double R = sc.nextDouble();
		System.out.println("Nhap toa do diem M: ");
		int xM = sc.nextInt();

		int yM = sc.nextInt();
		Point M = new Point(xM, yM);

		Point[] points = { O, M };
		PointUtils.check(R, points);

	}

}
