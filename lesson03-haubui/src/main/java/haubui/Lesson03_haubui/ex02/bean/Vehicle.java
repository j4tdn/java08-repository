package haubui.Lesson03_haubui.ex02.bean;

public class Vehicle {
	private String owner;
	private String type;
	private int cc;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String owner, String type, int cc, double price) {
		this.owner = owner;
		this.type = type;
		this.cc = cc;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return cc < 100 ? price + price / 100 : cc > 200 ? price + price * 5 / 100 : price + price * 3 / 100;
	}
}
