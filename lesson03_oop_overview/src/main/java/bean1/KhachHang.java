package bean1;

public class KhachHang {
	private String hoTen;
	private String sdt;
	private String CMND;
	private String diaChi;
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String hoTen, String sdt, String CMND, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.sdt = sdt;
		CMND = CMND;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String CMND) {
		CMND = CMND;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "ThietBi [hoTen=" + hoTen + ", sdt=" + sdt + ", CMND=" + CMND + ", diaChi=" + diaChi + "]";
	}

}
