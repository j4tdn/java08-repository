package bean;

public class Vehicle {
	private String owner;
	private String type;
	private int engine;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String owner, String type, int engine, double price) {
		this.owner = owner;
		this.type = type;
		this.engine = engine;
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

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		if (this.engine > 200) {
			return this.price * 0.05;
		}
		if (this.engine >= 100 && this.engine <= 200) {
			return this.price * 0.03;
		}
		return this.price * 0.01;
	}

	@Override
	public String toString() {
		return String.format("%-25s%-20s%15d%20.2f%20.2f", owner, type, engine, price, this.getTax());
	}

}
