package bean;

public class Staff extends People {
	private String UnitName;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public String getUnitName() {
		return UnitName;
	}

	public void setUnitName(String unitName) {
		UnitName = unitName;
	}

	public Staff(String name, int yearOfBirth, float coefficientsSalary, float coefficientPosition, String unitName) {
		super(name, yearOfBirth, coefficientsSalary, coefficientPosition);
		UnitName = unitName;
	}

	public double Salary() {
		return (super.getCoefficientsSalary() + getCoefficientPosition()) * 1250000;
	}

	@Override
	public String toString() {
		return super.toString() + "Lương: " + Salary() + "\n" + "Tên đơn vị: " + UnitName;
	}
}
