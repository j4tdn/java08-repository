package exercise02;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		ArrayList<Vehicle> listVehicles = new ArrayList<Vehicle>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 : Input");
		System.out.println("2 : Output");
		System.out.println("3 : Exit");
		System.out.println("=======================");
		System.out.print("Input type work :");
		int typeWork = scanner.nextInt();
		while (typeWork != 3) {
			switch (typeWork) {
			case 1:
				Vehicle xe01 = new Vehicle();
				Vehicle xe02 = new Vehicle();
				Vehicle xe03 = new Vehicle();
				System.out.println("Input vehicle 01: ");
				Vehicle.inputVehicle(xe01);
				System.out.println("Input vehicle 02: ");
				Vehicle.inputVehicle(xe02);
				System.out.println("Input vehicle 03: ");
				Vehicle.inputVehicle(xe03);

				listVehicles.add(xe01);
				listVehicles.add(xe02);
				listVehicles.add(xe03);
				break;
			case 2:
				System.out.printf("%1$15s %2$15s %3$15s %4$15s %5$15s \n", "Tên chủ xe", "Loại xe", "Dung tích",
						"Trị giá", "Thuế phải nộp");
				System.out.println("=================================================================================================================");
				for (Vehicle vehicle : listVehicles) {
					System.out.printf("%1$15s %2$15s %3$15s %4$15s %5$15s \n", vehicle.getOwner(), vehicle.getTypeVehicle(),
							vehicle.getCapacity(), vehicle.getValue(), vehicle.getTax());
				}
				break;
			case 3:

				break;

			default:
				break;
			}
			System.out.print("Input type work continue :");
			typeWork = scanner.nextInt();
		}
	}
}
