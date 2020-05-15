package haubui.Lesson03_haubui.ex02.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import haubui.Lesson03_haubui.ex02.bean.Vehicle;

public class VehicleController {
	private static Scanner sc = new Scanner(System.in);

	private Vehicle input() {
		System.out.println("nhập chủ xe: ");
		String owner = sc.nextLine();
		System.out.println("nhập loại xe: ");
		String type = sc.nextLine();
		System.out.println("nhập dung tích: ");
		int cc = Integer.parseInt(sc.nextLine());
		System.out.println("nhập giá: ");
		double price = Double.parseDouble(sc.nextLine());

		return new Vehicle(owner, type, cc, price);
	}

	private List<Vehicle> input(List<Vehicle> vehicles, int qty) {
		for (int i = 0; i < qty; i++) {
			System.out.println("\nNhập thông tin xe thứ " + (i + 1));
			vehicles.add(input());
		}
		return vehicles;
	}

	private void printf(List<Vehicle> vehicles) {
		if (vehicles.size() == 0) {
			System.out.println("không có dữ liệu !!!");
			return;
		}
		System.out.printf("\n%-15s %-15s %20s %20s %20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println(
				"\n===============================================================================================");
		DecimalFormat formatter = new DecimalFormat("###,###,###.00");
		for (Vehicle vehicle : vehicles) {
			System.out.printf("\n%-15s %-15s %20s %20s %20s", vehicle.getOwner(), vehicle.getType(), vehicle.getCc(),
					(formatter.format(vehicle.getPrice()) + " VNĐ"), (formatter.format(vehicle.getTax()) + " VNĐ"));
		}
		System.out.println();
	}

	public void menu() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		int choice = 0;
		while (choice != 3) {
			System.out.println("\n=========> QUẢN LÝ THÔNG TIN XE <=========");
			System.out.println("1. NHẬP THÔNG TIN XE");
			System.out.println("2. XUẤT BẢNG THÔNG TIN");
			System.out.println("3. THOÁT");
			System.out.println("------------------------------------------------------");
			System.out.println("NHẬP LỰA CHỌN: ");

			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				choice = 0;
			}

			switch (choice) {
			case 1:
				System.out.println("Bạn muốn nhập bao nhiêu xe?");
				int n = Integer.parseInt(sc.nextLine());
				input(vehicles, n);
				System.out.println("NHAP HOAN TAT !!! ");
				break;
			case 2:
				printf(vehicles);
				break;
			case 3:
				System.out.println("GOODBYE!!! (^_^)");
				break;
			default:
				System.out.println("vui long chon 1 , 2 hoac 3\n");
				break;
			}
		}
	}

}
