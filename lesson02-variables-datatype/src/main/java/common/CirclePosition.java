package common;

public enum CirclePosition {
 INSIDE("trong duong tron"),
 ONSITE("tren duong tron"),
 OUTSIDE("ngoai duong tron");
	
	public String value;
	CirclePosition(String value){
		System.out.println("value "+value);
		this.value=value;
	}
}
