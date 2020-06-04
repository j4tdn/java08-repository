package Ex04;

public class Manager extends People{ //Truong phong
	
	private int numberEmployees;
	
	public Manager() {
		
	}

	public Manager(String fullName, int yearBirth, float coefficientSalary, int numberEmployees) {
		super(fullName, yearBirth, coefficientSalary);
		this.numberEmployees = numberEmployees;
	}

	public float getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double getSalary() {
		double salary = 0;
		salary = (super.getCoefficientSalary()) * 2200000;
		return salary;
	}

	@Override
	public String toString() {
		return super.toString() + " \n-So luong nhan vien quan ly: " + numberEmployees + "\n-Luong: " + getSalary();
	}

}
