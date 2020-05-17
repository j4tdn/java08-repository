package bean;

public class Vehicle {
	public String name;
	public String type;
	public double cc;
	public double price;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String type, double cc, double price) {
		super();
		this.name = name;
		this.type = type;
		this.cc = cc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double Tax() {
		double tax = 0;
		if (cc < 100)
			tax = price * 1 / 100;
		else if (cc >= 100 && cc < 200)
			tax = price * 3 / 100;
		else
			tax = price * 5 / 100;
		return tax;
	}

	@Override
	public String toString() {
		return String.format("%-25s%-20s%-15.2f%-25.2f%25.2f \n", name, type, cc, price, this.Tax());
	}

}
