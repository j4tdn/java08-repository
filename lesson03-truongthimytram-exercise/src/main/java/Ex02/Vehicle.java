package Ex02;

public class Vehicle {
	private String owner;
	private String typeOfVehicle;
	private int capacity;
	private double price;
	private double tax;
	
	public Vehicle(String owner, String typeOfVehicle, int capacity, double price) {
		this.owner = owner;
		this.typeOfVehicle = typeOfVehicle;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
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
		if(this.getCapacity() < 100) tax = this.getPrice()*0.01;
		if(this.getCapacity() >= 100 && this.getCapacity() <= 200 ) tax = this.getPrice()*0.03;
		if(this.getCapacity() > 200) tax = this.getPrice()*0.05;
		return tax;
	}

}
