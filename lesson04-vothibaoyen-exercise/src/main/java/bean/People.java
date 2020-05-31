package bean;

public class People {
	private String ten;
	private int namsinh;
	private double hesoluong;

	public People() {

	}

	public People(String ten, int namsinh,double hesoluong) {
		super();
		this.ten = ten;
		this.namsinh = namsinh;
		this.hesoluong = hesoluong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public double getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}
	

}
