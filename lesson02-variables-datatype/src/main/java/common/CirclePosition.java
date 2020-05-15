package common;

public enum CirclePosition {
	INSITE("Trong duong tron"),
	ONSITE("Tren duong tron"),
	OUTSITE("Ngoai duong tron");
	
	public String value;
	
	CirclePosition (String value) {
		System.out.println("value" + value);
		this.value = value;
	}
}
