package bean;

public class Car {
	
	// thuộc tính 
	private String color ;
	private String type;
	private double price;
	
	
	
	
	//phương thức 
	private double speed() {
		if(price>500) {
			return 300;
		}
		else {
			return 200;
		}
	}
	
}
