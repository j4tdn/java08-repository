package ex02;

public class Vehicle {
	
	private String ownerVehicle;
	private String typeVehicle;
	private int cc;
	private float price;
	
	public Vehicle(String ownerVehicle, String typeVehicle, int cc, float price) {
		super();
		this.ownerVehicle = ownerVehicle;
		this.typeVehicle = typeVehicle;
		this.cc = cc;
		this.price = price;
	}

	public String getOwnerVehicle() {
		return ownerVehicle;
	}

	public void setOwnerVehicle(String ownerVehicle) {
		this.ownerVehicle = ownerVehicle;
	}

	public String getTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getTax() {
		if (this.price < 100) {
			return this.price * 0.01f;
		} else if (this.price < 200) {
			return this.price * 0.03f;
		} else {
			return this.price * 0.05f;
		}
	}

	@Override
	public String toString() {
		return "Vehicle [ownerVehicle=" + ownerVehicle + ", typeVehicle=" + typeVehicle + ", cc=" + cc + ", price="
				+ price + "] \t"+getTax();
	}
	
	
	
}
