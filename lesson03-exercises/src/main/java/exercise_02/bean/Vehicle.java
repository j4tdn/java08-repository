package exercise_02.bean;

public class Vehicle {
	static double ADDED1 = 0.1;
	static double ADDED2 = 0.3;
	static double ADDED3 = 0.5;
	
	private String owner;
	private String type;
	private int capacity;
	private double value;
	private double tax;	
	
	public Vehicle() {}

	private Vehicle(Builder builder) {
		this.owner = builder.owner;
		this.type = builder.type;
		this.capacity = builder.capacity;
		this.value = builder.value;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private String owner;
		private String type;
		private int capacity;
		private double value;
		
		public Builder() {}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
		
		public Builder owner(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Builder type(String type) {
			this.type = type;
			return this;
		}
		
		public Builder capacity(int capacity) {
			this.capacity = capacity;
			return this;
		}
		
		public Builder value(double value) {
			this.value = value;
			return this;
		}					
	}
		

	public String getOwner() {
		return owner;
	}

	public String getType() {
		return type;
	}

	public int getCapacity() {
		return capacity;
	}

	public double getValue() {
		return value;
	}

	public double getTax() {
		double tax = 0;
		if (this.getCapacity() < 100) 
			tax = this.getValue() * ADDED1;
		else if (this.getCapacity() <= 200) 
			tax = this.getValue() * ADDED2;
		else tax = this.getValue() * ADDED3;	
		return tax;
	}
	
	@Override
	public String toString() {
		return String.format("%15s %15s %20s %27s %23s", this.getOwner(), this.getType(), this.getCapacity(), this.getValue(), this.getTax());
	}
}
