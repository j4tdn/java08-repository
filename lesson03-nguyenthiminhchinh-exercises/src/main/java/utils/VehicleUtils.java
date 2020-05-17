package utils;

import java.util.Scanner;

import bean.Vehicle;

public class VehicleUtils {
	private VehicleUtils() {

	}

	public static void importV(Vehicle... vehicles) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println("Nhập thông tin xe thứ " + (i + 1));
			System.out.print("Tên chủ xe: ");
			String name = sc.next();

			System.out.print("Loại xe: ");
			String type = sc.next();

			System.out.print("Dung tích: ");
			double cc = sc.nextDouble();

			System.out.print("Giá: ");
			double price = sc.nextDouble();

			vehicles[i] = new Vehicle(name, type, cc, price);
		}
	}

	public static void export(Vehicle... vehicles) {
		if (vehicles.length == 0) {
			System.out.println("No information exits!!!");
		}
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}

}
