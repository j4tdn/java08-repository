package dto;

import java.time.LocalTime;

public class MatHangEx1Dto {
	public static final String MA_MH  = "maMH";
	public static final String TEN_MH  = "tenMH";
	public static final String THOI_GIAN_DAT_HANG  = "thoiGianDatHang";
	private Integer maMH;
	private String tenMH;
	private LocalTime thoiGianDatHang;

	public MatHangEx1Dto() {
		// TODO Auto-generated constructor stub
	}

	public MatHangEx1Dto(Integer maMH, String tenMH, LocalTime thoiGianDatHang) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.thoiGianDatHang = thoiGianDatHang;
	}

	public Integer getmaMH() {
		return maMH;
	}

	public void setmaMH(Integer maMH) {
		this.maMH = maMH;
	}

	public String gettenMH() {
		return tenMH;
	}

	public void settenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public LocalTime getThoiGianDatHang() {
		return thoiGianDatHang;
	}

	public void setThoiGianDatHang(LocalTime thoiGianDatHang) {
		this.thoiGianDatHang = thoiGianDatHang;
	}

}
