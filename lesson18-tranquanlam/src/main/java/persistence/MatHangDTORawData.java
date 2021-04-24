package persistence;

import java.time.LocalDateTime;

public class MatHangDTORawData {
	public static final String MA_MH = "maMH";
	public static final String TEN_MH = "tenMH";
	public static final String NGAY_TA0 = "ngayTao";
	public static final String SO_LUONG = "soLuong";

	private Integer maMH;
	private String tenMH;
	private LocalDateTime ngayTao;
	private Integer soLuong;

	public MatHangDTORawData() {
	}

	public MatHangDTORawData(Integer maMH, String tenMH, LocalDateTime ngayTao) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.ngayTao = ngayTao;
	}
	

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
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

	public LocalDateTime getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(LocalDateTime ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Override
	public String toString() {
		return "MatHangDTO [maMH=" + maMH + ", tenMH=" + tenMH + ", ngayTao=" + ngayTao + "]";
	}

}
