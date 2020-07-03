package bean;

public class Student {
	private int maso;
	private String name;
	private String xeploai;
	
	public Student() {
	}
		
	public Student(int maso, String name, String xeploai) {
		super();
		this.maso = maso;
		this.name = name;
		this.xeploai = xeploai;
	}

	public int getMaso() {
		return maso;
	}

	public void setMaso(int maso) {
		this.maso = maso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXeploai() {
		return xeploai;
	}

	public void setXeploai(String xeploai) {
		this.xeploai = xeploai;
	}
	
	
	
}
