package view;
import bean.GiamDoc;
import bean.NhanVien;

import bean.TruongPhong;

public class QuanLy {
	public static void main(String[] args) {
		System.out.println("\n====================== Nhap thong tin nhan vien cong ty======================\n");
		GiamDoc giamdoc = new GiamDoc();
		giamdoc = giamdoc.nhapgiamdoc();

		TruongPhong truongphong = new TruongPhong();
		truongphong = truongphong.nhaptruongphong();

		NhanVien[] nv = new NhanVien[2];
		NhanVien.nhapnhanvien(nv);

		System.out.println("\n======================== Danh sach nhan vien cong ty========================\n\n");

		System.out.println(giamdoc.toString());
		System.out.println(truongphong.toString());
		NhanVien.tostring(nv);
		

		System.out.println("\n======================== Bang luong cua nhan vien ============================\n");
		giamdoc.inluonggd();
		truongphong.inluongtp();
		NhanVien.inluongnv(nv);

	}

}
