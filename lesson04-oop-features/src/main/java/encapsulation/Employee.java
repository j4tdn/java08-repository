package encapsulation;

import java.time.LocalDate;

public class Employee {
	// access modifier: public, private, protected, [nothing]
	private String name;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	int getAge() {
		return LocalDate.now().getYear() - year;
	}

}
