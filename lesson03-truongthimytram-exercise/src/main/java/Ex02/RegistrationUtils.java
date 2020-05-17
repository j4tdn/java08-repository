package Ex02;

import java.util.Scanner;

public class RegistrationUtils {
	private static Scanner sc = new Scanner(System.in);
	  
	private RegistrationUtils() {
		
	}
	public static void exportTax(Vehicle[] vehicles) {
		if(vehicles.length == 0) System.out.println("Chưa có phương tiện nào được đăng kí!");
		else {
			System.out.format("%25s%20s%15s%25s%20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
			System.out.println();
			System.out.println("=====================================================================================================================================");
			System.out.println();
			for (Vehicle vehicle : vehicles) {
				System.out.format("%25s%20s%15s%25s%20s", vehicle.getOwner(),vehicle.getTypeOfVehicle(), vehicle.getCapacity(), vehicle.getPrice(), vehicle.getTax());
				System.out.println();
			}
			
		}
			
	}

	public static Vehicle[] enterVehicle() {
		int capacity = 0;
		double price = 0.0;
		boolean check = false;
		System.out.println("Nhập số lượng xe: ");
		int n = Integer.parseInt(sc.nextLine());
		Vehicle[] vehicles = new Vehicle[n];
		for(int i = 0; i < vehicles.length; i++) {
			System.out.println("Nhập tên chủ xe: ");
			String owner = sc.nextLine();
			System.out.println("Nhập loại xe: ");
			String typeOfVehicle = sc.nextLine();
			do {
				try {
					System.out.println("Nhập dung tích xe: ");
					 capacity = Integer.parseInt(sc.nextLine()); 
					 check = true;
					
				} catch (NumberFormatException e) {
					check = false;
					System.out.println("Bạn phải nhập 1 số!");
				}
			} while(!check);
			do {
				try {
					System.out.println("Nhập giá xe: ");
					price = Integer.parseInt(sc.nextLine()); 
					 check = true;
					
				} catch (NumberFormatException e) {
					check = false;
					System.out.println("Bạn phải nhập 1 số!");
				}
			} while(!check);
			vehicles[i] = new Vehicle(owner, typeOfVehicle, capacity, price);
		}
		return vehicles;
		
	}

}
