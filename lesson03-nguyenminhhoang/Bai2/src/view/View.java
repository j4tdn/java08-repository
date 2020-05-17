package view;

import java.util.Scanner;

import bean.Vehicle;
import controller.Controller;

public class View {

	private static Vehicle xe1 = new Vehicle();
	private static Vehicle xe2 = new Vehicle();
	private static Vehicle xe3 = new Vehicle();

	public static void main(String[] args) {
		Controller controller = new Controller();
		int key = 0;
		Scanner ip = new Scanner(System.in);
		do {
			System.err.println("=====================MENU=======================");
			System.out.println(" 1.nhap thong tin cac xe \n 2.Xuat ban ke khai tien thue truoc ba \n 3.Thoat");
			do {
				System.out.println("nhap vao lua chon");
				key = Integer.parseInt(ip.nextLine());
			} while (key > 4 && key < 0);
			switch (key) {
			case 1: {
				System.out.println("thong tin xe 1");
				controller.nhapThongTin(xe1);
				System.out.println("nhap thong tin xe 2");
				controller.nhapThongTin(xe2);
				System.out.println("nhap thong tin xe 3");
				controller.nhapThongTin(xe3);
			}
				break;
			case 2: {
				System.out.println("==== bang ke khai tien thue truoc ba cua xe ====");
				System.out.println("tenChuXe" + "\t\t" + "loaiXe" + "\t\t" + "dungTich" + "  \t" + "triGia" + "\t\t"
						+ "thuePhaiNop");
				System.out.println(xe1.toString());
				System.out.println(xe2.toString());
				System.out.println(xe3.toString());
			}
				break;
			case 3: {
				System.out.println("======> goodbye <========");
			}
			}
		} while (key < 3);

	}
}
