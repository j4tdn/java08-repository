package utils;

import java.util.Scanner;

import bean.Vehicle;

public class VehicleUtils {

	private VehicleUtils() {
	}

	public static Vehicle input() {
		Vehicle vehicle = new Vehicle();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tên chủ xe: ");
		do {						
			vehicle.setOwner(input.nextLine());
		} while (vehicle.getOwner().trim().length() == 0);
		
		System.out.print("Loại xe: ");
		do {						
			vehicle.setType(input.nextLine());
		} while (vehicle.getType().trim().length() == 0);
		
		do {
			try {
				System.out.print("Dung tích: ");
				vehicle.setEngine(Integer.parseInt(input.nextLine()));
				if(vehicle.getEngine() <= 0) throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Dung tích phải là số nguyên dương!");
			}
		} while (vehicle.getEngine() <= 0);
		
		do {
			try {
				System.out.print("Trị giá: ");
				vehicle.setPrice(Double.parseDouble(input.nextLine()));
				if (vehicle.getPrice() <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Trị giá phải là số dương!");
			}
		} while (vehicle.getPrice() <= 0);
		return vehicle;
	}

	public static void showTaxDeclaration(Vehicle[] vehicles) {
		if (vehicles.length == 0) {
			System.out.println("Không có dữ liệu");
		} else {
			System.out.format("%-25s%-20s%15s%20s%20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
					"Thuế phải nộp");
			System.out.println();
			for (int i = 0; i < 100; i++) {
				System.out.print("=");
			}
			System.out.println();
			for (Vehicle vehicle : vehicles) {
				System.out.println(vehicle);
			}
		}

	}
}
