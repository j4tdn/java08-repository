package exercise_02.view;

import java.util.Scanner;

import exercise_02.bean.Vehicle;
import exercise_02.util.VehicleUtil;

public class VehicleDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VehicleUtil util = new VehicleUtil();
//		Vehicle.Builder build = new Vehicle.Builder();
//		
//		System.out.println(build.owner("Nguyen Thu Loan").build().toString());
		
		while (true) {
			writeMenu();
			String choose = sc.nextLine();
			
			switch (choose) {
			case "1":
				Vehicle.Builder build = new Vehicle.Builder();				
				System.out.println("Vihicle: ");				
				//build.owner(sc.nextLine()).type(sc.nextLine()).capacity(sc.nextInt());
				build.owner(sc.nextLine()).type(sc.nextLine()).capacity(sc.nextInt());
				sc.nextLine();
				build.value(sc.nextDouble());
				sc.nextLine();
				util.appenArrayList(build.build());
				break;
			
			case "2":
				writeTable();
				util.expostTax();
				break;
				
			default:
				sc.close();
				return;
			}		
		}		
	}
	
	public static void writeTable() {
		System.out.println(String.format("%15s %15s %20s %30s %25s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp"));
		System.out.println("====================================================================================================================");
	}	
	
	public static void writeMenu() {
		System.out.println("\n\n================= MENU =================");
		System.out.println("1. Input infomation of vehicle");
		System.out.println("2. Export Registration tax of vehicles");
		System.out.println("0. Exit");
		System.out.println("========================================");
		System.out.println("Input what you want to do: ");
	}	
}