package view;

import java.util.Scanner;

import Utils.TaxUtils;

public class Bai2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		int luachon ;

		do {
			System.out.println("====================MENU======================");
			System.out.println("1. Nhap thong tin va tao cac doi tuong xe");
			System.out.println("2. Xuat bang ke khai tien thue truoc ba cua cac xe");
			System.out.println("3. Thoat");
			System.out.print("Nhap lua chon");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1:
				TaxUtils.nhapxe();
				break;

			case 2:
				TaxUtils.xuatbang();
				break;
			case 3:
				return;
			}
		} while (luachon > 0 && luachon < 3);
	}
}
