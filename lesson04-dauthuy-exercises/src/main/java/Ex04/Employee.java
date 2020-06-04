package Ex04;

public class Employee extends People {
	
	private String nameDepartment;
	
	public Employee() {
		
	}

	public Employee(String fullName, int yearBirth, float coefficientSalary, String nameDepartment) {
		super(fullName, yearBirth, coefficientSalary);
		this.nameDepartment = nameDepartment;
	}


	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	public double getSalary() {
		double salary = 0;
		salary = (super.getCoefficientSalary()) * 1250000;
		return salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " \n-Ten don vi: " + nameDepartment + "\n-Luong: " + getSalary();
	}

}
