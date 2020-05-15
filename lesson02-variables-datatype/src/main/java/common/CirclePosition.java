package common;

public enum CirclePosition {
	INSIDE ("Trong"), 
	ONSIDE ("Tren"), 
	OUTSIDE ("Ngoai");
	
	public String value;
	CirclePosition(String value){
		System.out.println("value: " + value);
		this.value = value;
	}

}
