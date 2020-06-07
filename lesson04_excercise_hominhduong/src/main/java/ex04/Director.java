package ex04;

public class Director extends People {

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(String name, int yearOfBirth, float salaryCoefficient, float positionCoefficient) {
		super(name, yearOfBirth, salaryCoefficient, positionCoefficient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getSalaryCoefficient() {
		// TODO Auto-generated method stub
		float salary = (this.salaryCoefficient + this.positionCoefficient) * 3000000;
		return salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Director: " + super.getName() + "\t salary: " + this.getSalaryCoefficient();
	}

}
