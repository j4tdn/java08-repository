package bean;

public class Car {
	//Thuộc tính
	private String color;
	private String type;
	private double price;
	
	//Phương thức
	private double speed() {
		if(price > 500) {
			return 300;
		}
		return 200;
	}
}
