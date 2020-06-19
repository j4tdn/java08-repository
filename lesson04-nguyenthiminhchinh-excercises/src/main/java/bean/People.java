package bean;

import java.util.Scanner;

public class People {
	private String Name;
	private int YearOfBirth;
	private float CoefficientsSalary;
	private float CoefficientPosition;

	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name, int yearOfBirth, float coefficientsSalary, float coefficientPosition) {
		super();
		Name = name;
		YearOfBirth = yearOfBirth;
		CoefficientsSalary = coefficientsSalary;
		CoefficientPosition = coefficientPosition;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getYearOfBirth() {
		return YearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}

	public float getCoefficientsSalary() {
		return CoefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		CoefficientsSalary = coefficientsSalary;
	}

	public float getCoefficientPosition() {
		return CoefficientPosition;
	}

	public void setCoefficientPosition(float coefficientPosition) {
		CoefficientPosition = coefficientPosition;
	}

	public void importS(People p) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Họ tên:");
		String Name = sc.nextLine();
		p.setName(Name);

		System.out.println("Năm sinh:");
		int YearOfBirth = Integer.parseInt(sc.nextLine());
		p.setYearOfBirth(YearOfBirth);

		System.out.println("Hệ số lương: ");
		float CoefficientsSalary = Float.parseFloat(sc.nextLine());
		p.setCoefficientsSalary(CoefficientsSalary);

		System.out.println("Hệ số chức vụ: ");
		float CoefficientPosition = Float.parseFloat(sc.nextLine());
		p.setCoefficientPosition(CoefficientPosition);
	}

	@Override
	public String toString() {
		return "Họ tên: " + Name + "\n" + "Năm sinh: " + YearOfBirth + "\n" + "Hệ số lương: " + CoefficientsSalary
				+ "\n" + "Hệ số chức vụ: " + CoefficientPosition + "\n";
	}
}
