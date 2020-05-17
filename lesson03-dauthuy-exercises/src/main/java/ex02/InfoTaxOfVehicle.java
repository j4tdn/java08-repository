package ex02;

import java.util.Scanner;
public class InfoTaxOfVehicle {
	
	
	public static void InputInfoVehicle(Vehicle vehicles[]) {
		Scanner sc = new Scanner(System.in);
		Vehicle vehicle = new Vehicle();
		for (int i = 0; i < 3; i++) {
			System.out.print("\nTen chu xe: ");
			String ownerName = sc.nextLine();
			
			System.out.print("Loai xe: ");
			String type = sc.nextLine();
			vehicle.setType(type);
			
			System.out.print("Dung tich: ");
			int capacity = Integer.parseInt(sc.nextLine());
			vehicle.setCapacity(capacity);
			
			System.out.print("Tri gia: ");
			double price = Double.parseDouble(sc.nextLine());
			vehicle.setPrice(price);
			
		    vehicles[i] = new Vehicle(ownerName, type, capacity, price);
		}

	}

	public static void export(Vehicle vehicle) {
		System.out.format("%-25s %-20s %-15s %-25.2f %-25.2f\n", vehicle.getOwnerName(), vehicle.getType(), vehicle.getCapacity(),
																 vehicle.getPrice(), vehicle.getTax());
	}
	
	public static void export(Vehicle ...vehicles) {
		if (vehicles.length == 0) {
			System.out.println("No information of vehicle exits!");
			return ;
		}
		
		for(Vehicle vehicle: vehicles) {
			export(vehicle);
		}
	}
}
