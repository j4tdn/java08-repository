package persistence;

public class LoaiHangDTO {
	private Integer maLoai;
	private String tenLoai;
	private Integer tongSoLuong;

	public LoaiHangDTO() {
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
		return tongSoLuong;
	}

	public void setSoLuong(Integer tongSoLuong) {
		this.tongSoLuong = tongSoLuong;
	}

	@Override
	public String toString() {
		return "LoaiHangDTO [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", SoLuong=" + tongSoLuong + "]";
	}

}
