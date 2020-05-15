package haubui.Lesson03_haubui.ex01.common;

public enum Position {
	OUTSIDE("Ngoai duong tron"), INSIDE("Trong duong tron"), ONSIDE("Tren duong tron");

	public String value;

	Position(String value) {
		this.value = value;
	}

}