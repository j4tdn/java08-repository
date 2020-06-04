package Ex04;

public class Director extends People { //Giam doc
	
	private float coefficientPosition;
	
	public Director() {
		
	}
	
	public Director(String fullName, int yearBirth, float coefficientSalary, float coefficientPosition) {
		super(fullName, yearBirth, coefficientSalary);
		this.coefficientPosition = coefficientPosition;
	}


	public float getCoefficientPosition() {
		return coefficientPosition;
	}
	
	public void setCoefficientPosition(float coefficientPosition) {
		this.coefficientPosition = coefficientPosition;
	}

	@Override
	public double getSalary() {
		double salary = 0;
		salary = (super.getCoefficientSalary() + coefficientPosition) * 3000000;
		return salary;
	}
	

	@Override
	public String toString() {
		return super.toString() + " \n-He so chuc vu: " + coefficientPosition + "\n-Luong: " + getSalary();
	}

}
