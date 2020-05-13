package view;

import java.util.Scanner;

import bean.Vehicle;
import utils.VehicleUtils;

public class Bai2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		Vehicle[] vehicles = {};
		int option = 0;
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("3. Thoát");
			do {
				try {
					System.out.print("Chọn: ");
					option = Integer.parseInt(input.nextLine());
					if(option < 1 || option > 3) throw new NumberFormatException();
				} catch (NumberFormatException e) {
					System.out.println("Nhập từ 1 - 3!" );
				}
			} while (option < 1 || option > 3);
			switch(option) {
				case 1:		
					Vehicle xe1, xe2, xe3;
					xe1 = VehicleUtils.input();
					xe2 = VehicleUtils.input();
					xe3 = VehicleUtils.input();
					vehicles = new Vehicle[] {xe1, xe2, xe3};
					break;
				case 2:
					VehicleUtils.showTaxDeclaration(vehicles);
					break;
				case 3: 
					return;
				default: 
					break;
			}
		}
	}
}
