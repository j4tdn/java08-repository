package ex04;

public class People {
	protected int yearOfBirth;
	protected String name;
	protected float salaryCoefficient;
	protected float positionCoefficient;

	public People() {
		super();
	}

	public People(String name, int yearOfBirth, float salaryCoefficient, float positionCoefficient) {
		super();
		this.yearOfBirth = yearOfBirth;
		this.name = name;
		this.salaryCoefficient = salaryCoefficient;
		this.positionCoefficient = positionCoefficient;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(float salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "People [yearOfBirth=" + yearOfBirth + ", name=" + name + ", salaryCoefficient=" + salaryCoefficient
				+ ", positionCoefficient=" + positionCoefficient + "]";
	}

}
