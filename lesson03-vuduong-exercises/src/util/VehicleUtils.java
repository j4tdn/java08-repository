package util;

import java.util.Scanner;

import bean.Vehicle;

public class VehicleUtils {
	private static Scanner ip = new Scanner(System.in);

	private VehicleUtils() {
		// TODO Auto-generated constructor stub
	}

	public static Vehicle input() {
		System.out.print("NHAP CHU XE: ");
		String chuxe = ip.nextLine();
		System.out.println("NHAP LOAI XE: ");
		String loaixe = ip.nextLine();
		System.out.println("NHAP DUNG TICH: ");
		int dungtich = Integer.parseInt(ip.nextLine());
		System.out.println("NHAP GIA: ");
		double gia = Double.parseDouble(ip.nextLine());
		double thue = 0;
		if (dungtich < 100) {
			thue = gia + gia / 100;
		}
		if (dungtich < 200 && dungtich >= 100) {
			thue = gia + gia / 100 * 3;
		}
		if (dungtich > 200) {
			thue = gia + gia / 100 * 5;
		}
		
		return new Vehicle(chuxe, loaixe, dungtich, gia, thue);
	}
}
