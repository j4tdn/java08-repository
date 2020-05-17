package utils;

import java.util.Scanner;

import bean.Vehicle;

public class CalTax {

	public CalTax() {

	}

	public static Vehicle nhaptt() {
		Scanner sc = new Scanner(System.in);

		Vehicle vehicle = new Vehicle();

		System.out.println("moi nhap ten chu xe: ");
		vehicle.setNameowner(sc.nextLine());

		System.out.println("moi ban nhap loai xe: ");
		vehicle.setType(sc.nextLine());

		System.out.println("moi ban nhap dung tich xe: ");
		vehicle.setCapacity(sc.nextInt());

		System.out.println("moi  ban nhap gia tien");
		vehicle.setPrice(sc.nextDouble());

		return vehicle;
	}

	public static void xuatdl(Vehicle[] vehicles) {
		for (Vehicle  vehicle:vehicles) {
			 vehicle.in();
		}
	}
}
