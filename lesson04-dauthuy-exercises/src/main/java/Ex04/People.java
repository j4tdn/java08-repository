package Ex04;

public abstract class People {
	private String fullName;
	private int yearBirth;
	private float coefficientSalary;
	
	public People() {

	}

	public People(String fullName, int yearBirth, float coefficientSalary) {
		super();
		this.fullName = fullName;
		this.yearBirth = yearBirth;
		this.coefficientSalary = coefficientSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}

	public float getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(float coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	public abstract double getSalary();
	
	@Override
	public String toString() {
		return " \n-Ho ten: " + fullName + " \n-Nam sinh: " 
				+ yearBirth + " \n-He so luong: " + coefficientSalary;
	}
}
