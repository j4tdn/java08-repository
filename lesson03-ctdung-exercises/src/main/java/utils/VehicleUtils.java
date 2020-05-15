package utils;

import java.util.Scanner;

import bean.Vehicle;

public class VehicleUtils {
	static Scanner sc = new Scanner(System.in);
	
	public static void nhapXe(Vehicle xe) {
		System.out.println("Chủ Xe: ");
		xe.setChuXe(sc.nextLine());
		
		System.out.println("Tên Xe: ");
		xe.setTenXe(sc.nextLine());
		
		System.out.println("Dung Tích: ");
		xe.setDungTich(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Giá Xe: ");
		xe.setGiaXe(Double.parseDouble(sc.nextLine()));
		
	}
}
