package view;

import java.util.Scanner;

import bean.ToaDo;

public class View {
	public static void main(String[] args) {
		ToaDo tam = new ToaDo();
		System.out.println("nhập vào hoành độ tâm I");
		Scanner ip = new Scanner(System.in);
		tam.setX(Integer.parseInt(ip.nextLine()));
		System.out.println("nhập vào tung độ tâm I");
		tam.setY(Integer.parseInt(ip.nextLine()));
		System.out.println("nhập vào bán kính r của đường tròn");
		int r = Integer.parseInt(ip.nextLine());
		ToaDo diemI = new ToaDo();
		System.out.println("nhập vào hoành độ điểm cần xét");
		diemI.setX(Integer.parseInt(ip.nextLine()));
		System.out.println("nhập vào tung độ điểm cần xét");
		diemI.setY(Integer.parseInt(ip.nextLine()));
		int khoangCach = (int) Math.sqrt((tam.getX() - diemI.getX()) * (tam.getX() - diemI.getX())
				+ (tam.getY() - diemI.getY()) * (tam.getY() - diemI.getY()));
		if (khoangCach > r) {
			System.out.println("Điểm cần xét không nằm trong vòng tròn");
		} else {
			System.out.println("Điểm cần xét có nằm trong vòng tròn");
		}
	}
}
