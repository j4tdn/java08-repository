package test_lesson03_oop;

public class SinhVien {

	public String ho_ten;
	public String tuoi;
	public String lop;
	
	public SinhVien() {
		
	}
	
	public SinhVien(String ho_ten, String tuoi, String lop) {
		super();
		this.ho_ten = ho_ten;
		this.tuoi = tuoi;
		this.lop = lop;
	}

	public String getHo_ten() {
		return ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
}
