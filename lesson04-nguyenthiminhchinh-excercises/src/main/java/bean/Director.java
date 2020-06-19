package bean;

public class Director extends People {
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public double Salary() {
		return (getCoefficientPosition() + getCoefficientsSalary()) * 3000000;
	}

	@Override
	public String toString() {
		return super.toString() + "Lương: " + Salary();
	}
}
