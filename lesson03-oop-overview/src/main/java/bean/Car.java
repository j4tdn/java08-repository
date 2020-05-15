package bean;

public class Car {
    // thuoc tinh
	private String color;
	private String type;
	private double price;
	
	
	// phuong thuc
	private double speed() {
		if(price>500) {
			return 300;
		}
		return 200;
	}
}
