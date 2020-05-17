package ex02;

public class Vehicle {
	private String ownerName;
	private String type;
	private int capacity; //dung tich
	private double price;
	private double tax;   //thue
	
	public Vehicle() {
	}

	public Vehicle(String ownerName, String type, int capacity, double price) {
		super();
		this.ownerName = ownerName;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		//this.tax = tax;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String name) {
		this.ownerName = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		double tax = 0;
		if (getCapacity() < 100) {
			tax = price * 0.1;
		}
		else if (getCapacity() >= 100 && getCapacity() <= 200) {
			tax = price * 0.3;
		}
		else {
			tax = price * 0.5;
		}
		return tax;
	}

	
}
