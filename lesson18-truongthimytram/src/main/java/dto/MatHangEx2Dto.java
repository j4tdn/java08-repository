package dto;

public class MatHangEx2Dto {
	public static final String MA_MH = "maMH";
	public static final String TEN_MH = "tenMH";
	public static final String SO_LUONG = "soLuong";
	private Integer maMH;
	private String tenMH;
	private Integer soLuong;

	public MatHangEx2Dto() {
		// TODO Auto-generated constructor stub
	}

	public MatHangEx2Dto(Integer maMH, String tenMH, Integer soLuong) {
		this.maMH = maMH;
		this.tenMH = tenMH;
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

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

}
