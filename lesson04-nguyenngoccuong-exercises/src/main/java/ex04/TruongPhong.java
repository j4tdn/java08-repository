package ex04;

import java.util.Scanner;

public class TruongPhong extends People {
	
	private int birthYear;
	private int numberOfEmployees;

	public TruongPhong() {
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public float getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public float getSalary() {
		return salaryCoefficient * 2200000;
	}
	
	@Override
	protected void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("---------- Truong Phong ----------");
		super.input();
		
		do {
			try {
				System.out.print("Birth Year: ");
				this.setBirthYear(Integer.parseInt(input.nextLine()));
				if (this.getBirthYear() <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Birth Year must be a positive integer!");
			}
		} while (this.getBirthYear() <= 0);
		
		do {
			try {
				System.out.print("Number of Employees: ");
				this.setNumberOfEmployees(Integer.parseInt(input.nextLine()));
				if (this.getNumberOfEmployees() <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Number of Employees must be a positive integer!");
			}
		} while (this.getNumberOfEmployees() <= 0);
	}

	@Override
	public String toString() {
		return "TruongPhong [fullname=" + name + ", birthYear=" + birthYear + ", salaryCoefficient=" + salaryCoefficient
				+ ", numberOfEmployees=" + numberOfEmployees + "]";
	}
}
