package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Vehicle;
import util.VehicleUtils;

public class Bai2 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		System.out.println("NHAP SO XE MUON KHOI TAO: ");
		menu(vehicles);
	}

	private static void menu(List<Vehicle> vehicles) {
		boolean close = false;
		do {
			System.out.println("LUA CHON CAC CONG VIEC");
			System.out.println("1. NHAP THONG TIN VA TAO CAC DOI TUONG XE");
			System.out.println("2. XUAT BANG KE KHAI TIEN THUE TRUOC BA CUA XE");
			System.out.println("3. THOAT");
			System.out.println("------------------------------------------------------");
			System.out.println("LUA CHON: ");
			int luachon;
			luachon = Integer.parseInt(ip.nextLine());
			
			switch (luachon) {
			case 1:
				vehicles.add(VehicleUtils.input());
				System.out.println("HOAN THANH NHAP DU LIEU XE ! ");
				System.out.println("------------------------------------------------------");
				break;
			case 2:
				System.out.println("========================================");
				System.out.println();
				for (Vehicle vehicle : vehicles) {
					System.out.println(vehicle);
				}
				
				System.out.println("========================================");
				System.out.println();
				break;
			case 3:
				close = true;
				break;
			}
		} while (close = true);
	}

}
