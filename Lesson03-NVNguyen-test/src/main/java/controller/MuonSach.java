package controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

import NVNguyen.Lesson03.Sach;
import NVNguyen.Lesson03.SinhVien;
import NVNguyen.Lesson03.TheMuon;

public class MuonSach {
	public MuonSach() {
		// TODO Auto-generated constructor stub
	}
	public TheMuon MuonSach(SinhVien sv, Sach[] sach) {
		TheMuon item=new TheMuon();
		Scanner ip=new Scanner(System.in);
		String ma = ip.nextLine();
		int thang = Integer.parseInt(ip.next());
		int ngayM = Integer.parseInt(ip.next());
		int ngayTra = Integer.parseInt(ip.next());
		item.setMaThe(ma);	
		LocalDate ngayMuon= LocalDate.of(Year.now().getValue(), thang, ngayM);
		item.setNgayMuon(ngayMuon);
		LocalDate hanTra= LocalDate.of(Year.now().getValue(), thang, ngayTra);
		item.setHanTra(hanTra);
		item.setSachDangMuon(sach);
		item.setSinhVienDangMuon(sv);
	
		return item;
	}

}
