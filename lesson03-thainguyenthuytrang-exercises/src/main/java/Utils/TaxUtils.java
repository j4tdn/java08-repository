package Utils;

import java.text.DecimalFormat;

import java.util.Scanner;
import bean.Vehicle;

public class TaxUtils {
	static Vehicle[] ve;

	public static double tinhthue(Vehicle vehicles) {
		double thue = 0;
		if (vehicles.getDungtich() < 100) {
			thue = vehicles.getGiatien() * 0.01;
		} else if (vehicles.getDungtich() < 200) {
			thue = vehicles.getGiatien() * 0.03;
		} else {
			thue = vehicles.getGiatien() * 0.05;
		}
		return thue;
	}

	public static void nhapxe() {

		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so doi tuong xe:");
		int index = sc.nextInt();
		ve = new Vehicle[index];
		for (int i = 0; i < ve.length; i++) {
			System.out.println("ten chu xe: ");
			String ten = sc.next();
			sc.nextLine();

			System.out.printf("loai xe: ");
			String loai = sc.next();
			sc.nextLine();

			System.out.printf("dung tich: ");
			int dungtich = sc.nextInt();

			System.out.printf("gia: ");
			double gia = sc.nextDouble();

			ve[i] = new Vehicle(ten, loai, dungtich, gia);

		}

	}

	public static void xuatbang() {

		try {
			System.out.format("%20s %20s %15s %30s %30s", "ten chu xe", "loai xe", "dung tich", "gia tien", "thue");
			System.out.println(
					"\n========================================================================================================================");

			for (int i = 0; i < ve.length; i++) {
				ve[i].setThue(tinhthue(ve[i]));
				DecimalFormat df = new DecimalFormat("##################0.00");
				System.out.printf("%20s %20s %15d %30s %30s", ve[i].getTenchuxe(), ve[i].getLoaixe(),
						ve[i].getDungtich(), df.format(ve[i].getGiatien()), df.format(ve[i].getThue()));
				System.out.println();
			}

		} catch (Exception e) {
			System.out.format("%20s %20s %15s %30s %30s\n", "0", "0", "0", "0", "0");
			System.out.println("mời nhập xe ");
			System.out.println();
		}
	}

}
