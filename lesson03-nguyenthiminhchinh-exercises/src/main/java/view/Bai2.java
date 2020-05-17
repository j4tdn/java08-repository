package view;

import java.util.Scanner;

import bean.Vehicle;
import utils.VehicleUtils;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		System.out.print("Nhập số lượng xe: ");
		int n = sc.nextInt();
		Vehicle[] v = new Vehicle[n];

		do {
			System.out.println("Menu");
			System.out.println("1. Nhập thông tin xe");
			System.out.println("2. Xuất bản kê khai tiền thuế trước bạ của các xe");
			System.out.println("3. Thoát");
			System.out.println("Chọn");
			t = sc.nextInt();
			switch (t) {
			case 1:
				System.out.println("1. Nhập thông tin");
				VehicleUtils.importV(v);
				break;
			case 2:
				System.out.println("2. Xuất bản kê khai tiền thuế trước bạ của các xe");
				System.out.format("%-25s%-20s%-15s%-25s%25s", "Tên chủ xe", "Loại xe", "Dung tích", "Giá",
						"Thuế phải nộp\n");
				System.out.println("================================================================================================================");
				VehicleUtils.export(v);
				break;
			case 3:
				System.out.println("Thoát");
				System.exit(0);
				break;
			}

		} while (t < 4);
	}

}
