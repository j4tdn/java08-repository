package view;

import java.util.Scanner;
import bean.Point;
import utils.Distance;

public class Bai1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập tọa độ tâm O: ");
		float xO = sc.nextFloat();
		float yO = sc.nextFloat();
		Point o = new Point(xO, yO);

		System.out.println("Nhập bán kính: ");
		float r = sc.nextFloat();

		System.out.println("Nhập tọa độ điểm A: ");
		float xA = sc.nextFloat();
		float yA = sc.nextFloat();
		Point a = new Point(xA, yA);

		Distance.check(o, a, r);
	}
}
