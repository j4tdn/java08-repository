package ex04;

public class Manager extends People {
	private int numberEmployeeOfManager;

	public Manager(String name, int yearOfBirth, float salaryCoefficient, int numberEmployeeOfManager) {
		super(name, yearOfBirth, salaryCoefficient, 0);
		this.numberEmployeeOfManager = numberEmployeeOfManager;
	}

	public int getNumberEmployeeOfManager() {
		return numberEmployeeOfManager;
	}

	public void setNumberEmployeeOfManager(int numberEmployeeOfManager) {
		this.numberEmployeeOfManager = numberEmployeeOfManager;
	}

	@Override
	public float getSalaryCoefficient() {
		float salary = (this.salaryCoefficient + this.positionCoefficient)*2200000;
		return salary;
	}

	@Override
	public String toString() {
		return "Manager [numberEmployeeOfManager=" + numberEmployeeOfManager + ", yearOfBirth=" + yearOfBirth
				+ ", name=" + name + ", salaryCoefficient=" + salaryCoefficient + ", positionCoefficient="
				+ positionCoefficient + ", getSalaryCoefficient()=" + getSalaryCoefficient() + "]";
	}
	
	
	
	

}
