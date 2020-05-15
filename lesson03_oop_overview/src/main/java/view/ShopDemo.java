package view;

import java.time.LocalDate;
import java.time.Month;

import bean1.HoaDon;
import bean1.KhachHang;
import bean1.ThietBi;

public class ShopDemo {
	public static void main(String[] args) {
		ThietBi nokia = new ThietBi("Nokia 1202", "Nokia", "den", 200);
		ThietBi dell = new ThietBi("dell 7474", "Window", "den", 2200);
		ThietBi oppo = new ThietBi("oppo A37", "android", "trang", 300);
		ThietBi iphone = new ThietBi("iphone 7", "IOS", "hong", 1200);

		KhachHang kh1 = new KhachHang("Nguyen Van Nguyen", "0768474286", "1918742747", "Hoa Khanh");
		KhachHang kh2 = new KhachHang("Nguyen Thi Hue", "0768838472", "1918737748", "Hoa Khanh");

		ThietBi[] tb1 = { nokia, iphone, oppo };
		ThietBi[] tb2 = { nokia, dell, oppo };
		ThietBi[] tb3 = { iphone, dell };

		HoaDon hd1 = new HoaDon("b01", LocalDate.of(2020, Month.AUGUST, 20), kh1, tb1);
		HoaDon hd2 = new HoaDon("hd2", LocalDate.of(2020, Month.DECEMBER, 10), kh2, tb2);
		HoaDon hd3 = new HoaDon("b03", LocalDate.of(2020, Month.MAY, 5), kh1, tb3);
		tongTien(hd1);
		tongTien(hd2);
		tongTien(hd3);
		
		xuatHD(hd1);
		xuatHD(hd2);
		xuatHD(hd3);
		
	}
	
	private static void xuatHD(HoaDon hd) {
		System.out.println(hd.toString());
	}

	private static double tongTien(HoaDon hd) {
		double sum = 0;
		for (int i = 0; i < hd.getThietBi().length; i++) {
			if(hd.getNgayMua().isEqual(LocalDate.of(2020, Month.MAY, 5)) && hd.getThietBi()[i].getGia() > 590) {
				sum = sum + hd.getThietBi()[i].getGia() * 0.9;
			}else {
			sum += hd.getThietBi()[i].getGia();
			
			}
		}	
		hd.setTongTien(sum);
		return sum;
	}

}
