package persistence;

import java.time.LocalTime;

public class Ex01 {
	public static String MA_MH = "MaMH";
	public static String TEN_MH="TenMH";
	public static String NGAY_TAO="ThoiGianDatHang";
	
	private int MaMH;
	private String TenMH;
	private LocalTime ThoiGianDatHang;
	
	
	public Ex01() {
		
	}
	public int getMaMH() {
		return MaMH;
	}
	public void setMaMH(int maMH) {
		MaMH = maMH;
	}
	public String getTenMH() {
		return TenMH;
	}
	public void setTenMH(String tenMH) {
		TenMH = tenMH;
	}
	public LocalTime getThoiGiaDatHang() {
		return ThoiGianDatHang;
	}
	public void setThoiGiaDatHang(LocalTime thoiGiaDatHang) {
		ThoiGianDatHang = thoiGiaDatHang;
	}
	
}
