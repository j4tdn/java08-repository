package bean;

public class Vehicle {
	private String nameowner;
	private String type;
	private int capacity;
	private double price;
	

	public Vehicle() {

	}

	public Vehicle(String nameowner, String type, int capacity, double price) {

		this.nameowner = nameowner;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		
	}

	public String getNameowner() {
		return nameowner;
	}

	public void setNameowner(String nameowner) {
		this.nameowner = nameowner;
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
	public double gettax() {
		double tax=0;
		if (this.getCapacity() < 100) {
			 tax=this.getPrice() * 0.01;
		} else {
			if (this.getCapacity() <= 100 && this.getCapacity() <= 200) {
				 tax = this.getPrice() * 0.03;
			} else
				 tax=this.getPrice() * 0.05;
		}
		return tax;
	}
	
	
	public void in() {
		System.out.format("%-25s%-20s%15d%25f%25f \n", nameowner, type, capacity, price, gettax());
	}
}
