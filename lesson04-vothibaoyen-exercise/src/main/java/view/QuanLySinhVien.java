package view;

import java.util.Scanner;

import bean.SinhVien;

public class QuanLySinhVien {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(102170313, "vo thi bao yen", 9, 9);
		SinhVien sv2 = new SinhVien(102170314, "vo thi my hanh", 9, 5);
		SinhVien sv3 = new SinhVien();
		System.out.println("\n====================== Nhap thong tin sinh vien ==============\n");
		sv3.setMaSv(nhapms());
		sv3.setTenSv(nhapht());
		sv3.setDienLT(nhapdlt());
		sv3.setDiemTH(nhapdth());
		System.out.println("\n======================= Danh sach sinh vien ==================\n");
		System.out.format("%-25s%-30s%-25s%-25s%-25s \n", "ma so sinh vien", "ho ten", "diem ly thuyet", "diem thuc hanh ","diem trung binh " );
		System.out.format("%-25d%-30s%-25f%-25f%-25f \n", sv1.getMaSv(), sv1.getTenSv(), sv1.getDienLT(), sv1.getDiemTH(),sv1.calDTB(sv1.getDienLT(),sv1.getDiemTH()));
		System.out.format("%-25d%-30s%-25f%-25f%-25f \n", sv2.getMaSv(), sv2.getTenSv(), sv2.getDienLT(), sv2.getDiemTH(),sv2.calDTB(sv2.getDienLT(),sv2.getDiemTH()));
		System.out.format("%-25d%-30s%-25f%-25f%-25f \n", sv3.getMaSv(), sv3.getTenSv(), sv3.getDienLT(), sv3.getDiemTH(),sv3.calDTB(sv3.getDienLT(),sv3.getDiemTH()));
	}

	public static Scanner sc = new Scanner(System.in);

	private static int nhapms() {
		int ms;
		System.out.print("moi nhap ma so sinh vien: ");
		ms = Integer.parseInt(sc.nextLine());
		return ms;
	}
	private static String nhapht() {
		String hoten;
		System.out.print("moi nhap ten sinh vien: ");
		hoten = sc.nextLine();		
		return hoten;
	}
	private static float nhapdlt() {
		float dlt;
		System.out.print("moi nhap diem ly thuyet sinh vien: ");
		dlt = sc.nextFloat();		
		return dlt;
	}
	private static float nhapdth() {
		float dth;
		System.out.print("moi nhap diem thuc hanh sinh vien: ");
		dth = sc.nextFloat();	
		return dth;
	}
}
