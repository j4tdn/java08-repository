package baitap;

public class Vehicle {
	private String fullName;
	private String brand;
	private int capacity;
	private double price;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String fullName, String brand, int capacity, double price) {
		super();
		this.fullName = fullName;
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	
	

}
