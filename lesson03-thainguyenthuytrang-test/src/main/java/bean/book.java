package bean;

import java.time.LocalDate;

public class book {
	private int id;
	private String ten;
	private String NXB;

	public book() {
	}
	

	public book(int id, String ten, String nXB) {
		super();
		this.id = id;
		this.ten = ten;
		NXB = nXB;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}

}
