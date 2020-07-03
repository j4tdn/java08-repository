package bai01;

public class Student {
	private int id;
	private String hoTen;
	private String xepLoai;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String hoTen, String xepLoai) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.xepLoai = xepLoai;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", hoTen=" + hoTen + ", xepLoai=" + xepLoai + "]";
	}

}
