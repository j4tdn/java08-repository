package Bai2;

public class Vehicle {
	private String name ;
	private String owner;
	private double price ;
	private int capacity ;
	private double tax;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name ,String owner, double price , int capacity) {
		this.name  = name ;
		this.owner = owner;
		this.price = price ;
		this.capacity = capacity;
		
		
		
		System.out.println(this.name);
	}
	
	public void getTax() {
		if(this.capacity < 100) {
			this.tax =  (1.0/100)*this.price;
			
		}
		
		else if(this.capacity>100 && this.capacity < 200) {
			this.tax =  (3.0/100) *this.price;
			
		}
		
		else {
			this.tax = (5.0/100) * this.price ;
		}
		
		
	}
	public String toString() {
		return this.owner + "\t" + this.name + "\t" + this.capacity + "\t" + this.price + "\t" + this.tax ;
	}
	
	
}
