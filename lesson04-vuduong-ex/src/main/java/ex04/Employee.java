package ex04;

import java.time.LocalDate;

public class Employee extends People{
	private String name;
	private LocalDate dayOfBirth;
	private double coefficientSalary;
	private String department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, LocalDate dayOfBirth, double coefficientSalary, String department) {
		super();
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.coefficientSalary = coefficientSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public double getSalary() {
		return coefficientSalary * 125000;
	}

	@Override
	public String toString() {
		return "Employee: " + name + " - " + dayOfBirth + " - " + coefficientSalary
				+ " - " + department + " - " + getSalary();
	}
	
	
}
