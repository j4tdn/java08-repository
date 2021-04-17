package persistence;

public class Ex02 {

	public static String MA_LOAI="MaLoai";
	public static String TEN_LOAI="TenLoai";
	public static String SO_LUONG="SoLuong";
	
	private Integer MaLoai;
	private String TenLoai;
	private Integer SoLuong;
	
	public Ex02() {
		
	}

	public Integer getMaLoai() {
		return MaLoai;
	}

	public void setMaLoai(Integer maLoai) {
		MaLoai = maLoai;
	}

	public String getTenLoai() {
		return TenLoai;
	}

	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}

	public Integer getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(Integer soLuong) {
		SoLuong = soLuong;
	}

	
}
