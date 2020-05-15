package bean1;

import java.time.LocalDate;
import java.util.Arrays;

public class HoaDon {
	private String id;
	private LocalDate ngayMua;
	private KhachHang kh1;
	private ThietBi[] thietBi;
	private double tongTien;

	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

	public HoaDon(String id, LocalDate ngayMua, KhachHang kh1, ThietBi[] thietBi) {
		super();
		this.id = id;
		this.ngayMua = ngayMua;
		this.kh1 = kh1;
		this.thietBi = thietBi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(LocalDate ngayMua) {
		this.ngayMua = ngayMua;
	}

	public KhachHang getKh1() {
		return kh1;
	}

	public void setKh1(KhachHang kh1) {
		this.kh1 = kh1;
	}

	public ThietBi[] getThietBi() {
		return thietBi;
	}

	public void setThietBi(ThietBi[] thietBi) {
		this.thietBi = thietBi;
	}
	
	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	@Override
	public String toString() {
		return "id = " + id + "\nkhach hang = " + kh1+ "\nngayMua = " + ngayMua  + "\nthietBi = "
				+ Arrays.toString(thietBi) + "\ntongTien = "+ tongTien;
	}

}
