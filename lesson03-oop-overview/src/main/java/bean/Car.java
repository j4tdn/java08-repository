package bean;

public class Car {
	//Thuoc tinh
	private String color;
	private String type;
	private double price;
	
	//Phuong thuc
	private double speed() {
		if (price > 500) {
			return 300;
		}
		return 200;
	}
	
}
