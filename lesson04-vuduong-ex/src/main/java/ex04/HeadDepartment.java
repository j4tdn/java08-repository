package ex04;

public class HeadDepartment extends People {
	private String name;
	private int yearOfBirth;
	private double coefficientSalary;
	private int numberOfEmployee;

	public HeadDepartment() {
		// TODO Auto-generated constructor stub
	}

	public HeadDepartment(String name, int yearOfBirth, double coefficientSalary, int numberOfEmployee) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.coefficientSalary = coefficientSalary;
		this.numberOfEmployee = numberOfEmployee;
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

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	
	@Override
	public double getSalary() {
		return coefficientSalary * 220000;
	}

	@Override
	public String toString() {
		return "HeadDepartment: " + name + " - " + yearOfBirth + " - "
				+ coefficientSalary + " - " + numberOfEmployee + "- " + getSalary();
	}
	
	

}
