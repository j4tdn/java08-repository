package ex04;

public class Employee extends People{
	private String nameOfDepartment;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int yearOfBirth, float salaryCoefficient, String nameOfDepartment) {
		super(name, yearOfBirth, salaryCoefficient, 0);
		this.nameOfDepartment = nameOfDepartment;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public float getSalaryCoefficient() {
		// TODO Auto-generated method stub
		float salary = (this.salaryCoefficient + this.positionCoefficient)*12500000;
		return salary;
	}

	@Override
	public String toString() {
		return "Employee:\t"+this.getName()+" \t"+super.toString()+"\tsalary\t"+this.getSalaryCoefficient();
	}
	
	
	
	
	
	
	
}
