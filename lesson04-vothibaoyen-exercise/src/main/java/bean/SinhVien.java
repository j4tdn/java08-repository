package bean;

public class SinhVien {
	private int maSv;
	private String tenSv;
	private float dienLT;
	private float diemTH;
	
	public SinhVien() {
		
	}
	public SinhVien(int maSv, String tenSv, float dienLT, float diemTH) {
		
		this.maSv = maSv;
		this.tenSv = tenSv;
		this.dienLT = dienLT;
		this.diemTH = diemTH;
	}
	public int getMaSv() {
		return maSv;
	}
	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}
	public String getTenSv() {
		return tenSv;
	}
	public void setTenSv(String tenSv) {
		this.tenSv = tenSv;
	}
	public float getDienLT() {
		return dienLT;
	}
	public void setDienLT(float dienLT) {
		this.dienLT = dienLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	
	@Override
	public String toString() {
		
		return "Ma so:  "+maSv+"\n Ho Ten: "+tenSv+"\n Diem ly thuyet: "+dienLT+"\n Diem thuc hanh: "+diemTH;
	}
	
	public static float calDTB(float dlt,float dth) {
		return (dlt+dth)/2;
	}

}

