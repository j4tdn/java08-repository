package encapsulation;

import java.time.LocalDate;

public class Employee {
	private String hoTen;
	private int year;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	private int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	int getAge() {
		return LocalDate.now().getYear() - year;
	}
}
