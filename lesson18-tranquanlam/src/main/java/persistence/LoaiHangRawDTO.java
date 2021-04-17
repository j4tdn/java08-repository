package persistence;

public class LoaiHangRawDTO {
	
	public static final String MA_LOAI = "maLoai";
	public static final String TEN_LOAI = "tenLoai";
	public static final String SO_LUONG = "SoLuong";
	
	private Integer maLoai;
	private String tenLoai;
	private Integer SoLuong;

	public LoaiHangRawDTO() {
		super();
	}

	public Integer getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(Integer maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public Integer getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(Integer soLuong) {
		SoLuong = soLuong;
	}

	@Override
	public String toString() {
		return "LoaiHangDTO [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", SoLuong=" + SoLuong + "]";
	}

}
