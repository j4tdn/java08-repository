package exercise02;

import java.util.Scanner;

public class Vehicle {
	private String owner;
	private String typeVehicle;
	private int capacity;
	private double value;

	public Vehicle() {
		super();
	}

	public Vehicle(String owner, String typeVehicle, int capacity, double value) {
		super();
		this.owner = owner;
		this.typeVehicle = typeVehicle;
		this.capacity = capacity;
		this.value = value;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getTax() {
		if (capacity <= 100) {
			return this.value * 0.01;
		} else if (100 < capacity && capacity < 200) {
			return this.value * 0.03;
		} else {
			return this.value * 0.05;
		}
	}
	
	public static Vehicle inputVehicle(Vehicle vehicle) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input owner : ");
		vehicle.setOwner(scanner.nextLine());
		System.out.print("==>Input type vehicle: ");
		vehicle.setTypeVehicle(scanner.nextLine());
		System.out.print("==>Input type capacity: ");
		vehicle.setCapacity(scanner.nextInt());
		System.out.print("==>Input type value: ");
		vehicle.setValue(scanner.nextDouble());
		
		return vehicle;
	}
}
