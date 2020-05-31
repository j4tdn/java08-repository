package bean;

import java.util.Scanner;

public class NhanVien extends People {
	private String tendonvi;

	public NhanVien() {

	}

	public NhanVien(String ten, int namsinh, double hesoluong, String tendonvi) {
		super(ten, namsinh, hesoluong);
		this.tendonvi = tendonvi;

	}

	public String getTendonvi() {
		return tendonvi;
	}

	public void setTendonvi(String tendonvi) {
		this.tendonvi = tendonvi;
	}

	public static void tostring(NhanVien... nhanViens) {
		for (int i = 0; i < nhanViens.length; i++) {
			System.out.format("%-25s%-20s%-20s%-20s \n", "Ten nhan vien " + i + " ", "Nam sinh", "He so luong",
					"Ten don vi");
			System.out.format("%-25s%-20d%-20f%-20s \n\n", nhanViens[i].getTen(), nhanViens[i].getNamsinh(),
					nhanViens[i].getHesoluong(), nhanViens[i].getTendonvi());
		}

	}

	public static void nhapnhanvien(NhanVien... n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = new NhanVien();
			Scanner sc = new Scanner(System.in);
			System.out.print("moi nhap ten nhan vien " + i + ": ");
			n[i].setTen(sc.nextLine());
			System.out.print("moi nhap nam sinh nhan vien " + i + " : ");
			n[i].setNamsinh(Integer.parseInt(sc.nextLine()));
			System.out.print("moi nhap he so luong nhan vien " + i + " : ");
			n[i].setHesoluong(Double.parseDouble(sc.nextLine()));
			System.out.print("moi nhap ten don vi nhan vien " + i + ": ");
			n[i].setTendonvi(sc.nextLine());
		}

	}

	public static void inluongnv(NhanVien... nhanViens) {
		double luong = 0;
		for (int i = 0; i < nhanViens.length; i++) {
			luong = nhanViens[i].getHesoluong() * 1250000;
			System.out.println("Luong cua nhan vien "+i+" la: " + luong);
		}
	}

	

}
