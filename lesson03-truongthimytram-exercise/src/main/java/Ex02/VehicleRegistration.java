package Ex02;

import java.util.Scanner;

public class VehicleRegistration {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int selection;
		Vehicle[] vehicles = null;
		do {
		System.out.println("Menu: ");
		System.out.println("1. Nhập thông tin xe");
		System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
		System.out.println("3. Thoát");
	    selection = Integer.parseInt(sc.nextLine());
		switch (selection) {
		case 1: 
			vehicles = RegistrationUtils.enterVehicle();
			break;
		case 2:
			RegistrationUtils.exportTax(vehicles);
			break;
		case 3:
			return;
		}
	} while(selection > 0 && selection <= 3 );
		
	}
	
}

