package bean;

public class Car {
	private String color;
	private String type;
	private double price;

	private double speed() {
		if (price > 500) {
			return 300;
		}
		return 200;
	}
}
