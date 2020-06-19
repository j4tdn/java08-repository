package bean;

public class Manager extends People {
	private int NumberOfStaff;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int yearOfBirth, float coefficientsSalary, float coefficientPosition,
			int numberOfStaff) {
		super(name, yearOfBirth, coefficientsSalary, coefficientPosition);
		NumberOfStaff = numberOfStaff;
	}

	public int getNumberOfStaff() {
		return NumberOfStaff;
	}

	public void setNumberOfStaff(int numberOfStaff) {
		NumberOfStaff = numberOfStaff;
	}

	public double Salary() {
		return (super.getCoefficientsSalary()+getCoefficientPosition())*2200000;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Lương: " + Salary() +"\n" + "Số lượng nhân viên: " + NumberOfStaff;
	}

}
