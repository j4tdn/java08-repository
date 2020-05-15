package encapsulation;

import java.time.LocalDate;

public class Employee {
	// Access modifier: public, private, protected, default, [nothing]
	// default: mac dinh khong co gi ca hoac la default
	// nothing & protected chi su dung trong package
	
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
