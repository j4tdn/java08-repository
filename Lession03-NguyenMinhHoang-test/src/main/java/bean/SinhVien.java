package bean;

public class SinhVien {
	private String hoTen;
	private int tuoi;
	private String lop;

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String hoTen, int tuoi, String lop) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.lop = lop;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return hoTen + ", tuoi :" + tuoi + ", lop :" + lop + " ";
	}

}
