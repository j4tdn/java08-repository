package ex04;

public class Director extends People {
	private String name;
	private int yearOfBirth;
	private double coefficientSalary;
	private double coefficientPosition;

	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, int yearOfBirth, double coefficientSalary, double coefficientPosition) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.coefficientSalary = coefficientSalary;
		this.coefficientPosition = coefficientPosition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	public double getCoefficientPosition() {
		return coefficientPosition;
	}

	public void setCoefficientPosition(double coefficientPosition) {
		this.coefficientPosition = coefficientPosition;
	}

	@Override
	public double getSalary() {
		return (coefficientPosition + coefficientSalary) * 300000;
	}

	@Override
	public String toString() {
		return "Director: " + name + " - " + yearOfBirth + " - " + coefficientSalary
				+ " - " + coefficientPosition + " - " + getSalary();
	}

}
