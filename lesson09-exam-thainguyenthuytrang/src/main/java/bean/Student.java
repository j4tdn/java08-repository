package bean;

public class Student {
	private int MSV;
	private String hoten;
	private String xeploai;
	
	public Student() {
	}
	

	public Student(int mSV, String hoten, String xeploai) {
		super();
		MSV = mSV;
		this.hoten = hoten;
		this.xeploai = xeploai;
	}


	public int getMSV() {
		return MSV;
	}

	public void setMSV(int mSV) {
		MSV = mSV;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}


	@Override
	public String toString() {
		return "MSV=" + MSV + " hoten=" + hoten + " xeploai=" + xeploai ;
	}


	

}
