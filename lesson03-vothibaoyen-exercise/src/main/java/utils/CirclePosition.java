package utils;

public enum CirclePosition {

	INSIDE("trong duong tron"), ONSITE("tren duong tron"), OUTSIDE("ngoai duong tron");

	public String value;

	CirclePosition(String value) {
		this.value = value;
	}
}