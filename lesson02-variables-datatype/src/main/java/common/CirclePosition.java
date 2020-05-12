package common;

public enum CirclePosition {
	OUTSIDE("NGOAI DUONG TRON"), 
	INSIDE("TRONG DUONG TRONG"), 
	ONSIDE("TREN DUONG TRON");
	
	private String value;
	
	CirclePosition(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	
}
