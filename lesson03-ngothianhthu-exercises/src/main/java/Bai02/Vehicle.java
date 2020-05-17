package Bai02;

public class Vehicle {

	private String CarType;
	private int XyLanh;
	private float Prices;
	
	
	public Vehicle() {
	}

	public Vehicle(String carType, int xyLanh, float prices) {
		super();
		CarType = carType;
		XyLanh = xyLanh;
		Prices = prices;
		
	}

	public String getCarType() {
		return CarType;
	}

	public void setCarType(String carType) {
		CarType = carType;
	}

	public int getXyLanh() {
		return XyLanh;
	}

	public void setXyLanh(int xyLanh) {
		XyLanh = xyLanh;
	}

	public float getPrices() {
		return Prices;
	}

	public void setPrices(float prices) {
		Prices = prices;
	}


	

	
	
	
}
