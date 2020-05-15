package j4t.common;

public enum CirclePosition {
	INSIDE("Trong duong tron"), 
	ONSIDE("Tren duong tron"), 
	OUTSIDE("Ngoai duong tron");
	
	public String value;
	
	CirclePosition(String value) {
		this.value = value;
	}
	
	/*
	 * enum laf moojt hawng neen ko cho public
	 */
	
}
