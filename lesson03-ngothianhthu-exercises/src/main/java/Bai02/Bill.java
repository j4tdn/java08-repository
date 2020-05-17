package Bai02;

public class Bill {

	
	private String FullName;
	private String CarType;
	private int XyLanh;
	private float Prices;
	
	
	public Bill() {
	}

	public Bill(String fullName, String carType, int xyLanh, float prices) {
		super();
		FullName = fullName;
		CarType = carType;
		XyLanh = xyLanh;
		Prices = prices;
		
		
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
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

	@Override
	public String toString() {
		return  FullName + "   |   "+ CarType +"   |   "+ XyLanh + "   |   "+ Prices+ "   |   "
				;
	}

	
	
	

	
	
	
}
