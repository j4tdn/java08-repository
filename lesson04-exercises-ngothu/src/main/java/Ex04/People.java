package Ex04;

public class People {
	protected String fullname;
	protected float coefficientsalary;

	public People() {
	}

	public People(String fullname, float coefficientsalary) {
		super();
		this.fullname = fullname;
		this.coefficientsalary = coefficientsalary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getCoefficientsalary() {
		return coefficientsalary;
	}

	public void setCoefficientsalary(float coefficientsalary) {
		this.coefficientsalary = coefficientsalary;
	}

}
