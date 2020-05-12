package bean;

public class Student {
	private String hoten;
	private String tuoi;
	private String lop;
	
	public Student() {
		
	}
	
	public Student(String hoten, String tuoi, String lop) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.lop = lop;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
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
