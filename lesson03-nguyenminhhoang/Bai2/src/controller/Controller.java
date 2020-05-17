package controller;

import java.util.Scanner;

import bean.Vehicle;

public class Controller {
	public void nhapThongTin(Vehicle xe) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap vao ten chu xe");
		String chuXe = ip.nextLine();
		xe.setChuXe(chuXe);
		System.out.println("nhap vao ten xe");
		String tenXe = ip.nextLine();
		xe.setTenXe(tenXe);
		System.out.println("nhap vao gia xe");
		int giaXe = Integer.parseInt(ip.nextLine());
		xe.setGiaXe(giaXe);
		System.out.println("nhap vao dung tich xe");
		int dungTich = Integer.parseInt(ip.nextLine());
		xe.setDungTich(dungTich);
	}
}
