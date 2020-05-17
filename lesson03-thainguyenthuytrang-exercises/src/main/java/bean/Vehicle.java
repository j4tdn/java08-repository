package bean;

public class Vehicle {
	private String tenchuxe;
	private String loaixe;
	private int dungtich;
	private Double giatien;
	private double thue;

	public Vehicle() {

	}

	public Vehicle(String tenchuxe, String loaixe, int dungtich, Double giatien) {
		super();
		this.tenchuxe = tenchuxe;
		this.loaixe = loaixe;
		this.dungtich = dungtich;
		this.giatien = giatien;
	
	}
	public String getTenchuxe() {
		return tenchuxe;
	}

	public void setTenchuxe(String tenchuxe) {
		this.tenchuxe = tenchuxe;
	}
	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

	public double getGiatien() {
		return giatien;
	}

	public void setGiatien(Double giatien) {
		this.giatien = giatien;
	}
	

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	@Override
	public String toString() {
		return tenchuxe + loaixe + dungtich + giatien + thue;
	}

}
