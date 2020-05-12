package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Atm;
import bean.Sach;
import bean.SinhVien;
import bean.TheMuon;

public class OverView {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("leVanA", 20, "15t2");
		SinhVien sv2 = new SinhVien("leVanB", 21, "15t3");

		Sach toan = new Sach("01", "toan", "A");
		Sach tiengViet = new Sach("02", "tieng viet", "b");
		Sach tiengAnh = new Sach("02", "tieng anh", "c");
		Sach dsSach1[] = { toan, tiengViet };
		Sach dsSach2[] = { toan, tiengAnh, tiengViet };

		Atm card1 = new Atm("01", LocalDate.of(2020, Month.MAY, 20), LocalDate.of(2020, Month.MAY, 20).plusDays(5),
				dsSach1, sv1);

		Atm card2 = new Atm("02", LocalDate.of(2020, Month.MAY, 30), LocalDate.of(2020, Month.MAY, 20).plusDays(5),
				dsSach2, sv1);

		TheMuon theMuon01 = new TheMuon("01", sv1, dsSach1, card1);
		TheMuon theMuon02 = new TheMuon("02", sv2, dsSach2, card2);

		System.out.println(theMuon01.toString());
		System.out.println("===========================");
		System.out.println(theMuon02.toString());
	}
}
