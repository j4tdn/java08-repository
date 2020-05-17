package ex02;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehicle vehicles[] = new Vehicle[3];
		int choose;
		do {
			System.out.println("\n======================MENU=======================");
			System.out.println("1. Nhap thong tin va tao cac doi tuong xe");
			System.out.println("2. Xuat bang ke khai tien thue truoc ba cua cac xe");
			System.out.println("3. Thoat");
			System.out.println("===================================================\n");
			System.out.print("Nhap lua chon: ");
			choose = sc.nextInt();
			
			switch (choose) {
			case 1:
				System.out.println("\nNhap thong tin va tao doi tuong xe ");
				InfoTaxOfVehicle.InputInfoVehicle(vehicles);
				break;
				
			case 2:
				System.out.println("Thong tin tien thue truoc ba cua xe\n");
				System.out.format("%-25s %-20s %-15s %-25s %-25s \n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
				InfoTaxOfVehicle.export(vehicles);
				break;
				
			case 3:
				return;
			}
			
		}while(choose > 0 && choose <= 3);
		
	}
}
