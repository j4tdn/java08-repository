package persistence;

import java.time.LocalTime;

public class MatHangDTO {
	private Integer maMH;
	private String tenMH;
	private LocalTime thoiGianDatHanh;

	public MatHangDTO() {
	}

	public MatHangDTO(Integer maMH, String tenMH, LocalTime thoiGianDatHanh) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.thoiGianDatHanh = thoiGianDatHanh;
	}

	public Integer getMaMH() {
		return maMH;
	}

	public void setMaMH(Integer maMH) {
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public LocalTime getThoiGianDatHanh() {
		return thoiGianDatHanh;
	}

	public void setThoiGianDatHanh(LocalTime thoiGianDatHanh) {
		this.thoiGianDatHanh = thoiGianDatHanh;
	}

	@Override
	public String toString() {
		return "MatHangDTO [maMH=" + maMH + ", tenMH=" + tenMH + ", thoiGianDatHanh=" + thoiGianDatHanh + "]";
	}

}
