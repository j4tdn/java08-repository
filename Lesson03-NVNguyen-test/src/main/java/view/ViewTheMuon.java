package view;

import java.time.LocalDate;

import NVNguyen.Lesson03.Sach;
import NVNguyen.Lesson03.SinhVien;
import controller.MuonSach;

public class ViewTheMuon {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien("NguyenVanNguyen", "15T3", LocalDate.of(1996, 2, 10));
		SinhVien sv1 = new SinhVien("NguyenVanTeo", "15T3", LocalDate.of(1998, 9, 20));
		Sach sach1 = new Sach("Sach1", "ten rat hay", "Nguyent3");
		Sach sach2 = new Sach("Sach2", "ten rat te", "teo");
		Sach sach3 = new Sach("Sach3", "ten qua do", "Nguyent3");
		Sach sach4= new Sach("Sach4", "ten qua hay", "teo");
		
		Sach[] ds = {sach1,sach2,sach3};
		Sach[] ds1 = {sach1,sach2,sach3};
		Sach[] ds2 = {sach1,sach2,sach3};
		
		MuonSach ms= new MuonSach();
		ms.MuonSach(sv1, ds);
		MuonSach ms1= new MuonSach();
		ms1.MuonSach(sv, ds2);
		
		System.out.println(ms.toString());
	}

}
