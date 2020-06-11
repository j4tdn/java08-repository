package ex04;

import java.util.Scanner;

public abstract class People {
	protected String name;
	protected float salaryCoefficient;

	public People() {
	}

	public People(String name, float salaryCoefficient) {
		super();
		this.name = name;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(float salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	abstract protected float getSalary();

	protected void input() {
		Scanner input = new Scanner(System.in);

		System.out.print("Full Name: ");
		do {
			this.setName(input.nextLine());
		} while (this.getName().trim().length() == 0);

		do {
			try {
				System.out.print("Salary Coefficient: ");
				this.setSalaryCoefficient(Float.parseFloat(input.nextLine()));
				if (this.getSalaryCoefficient() <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Salary Coefficient must be a positive integer!");
			}
		} while (this.getSalaryCoefficient() <= 0);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", salaryCoefficient=" + salaryCoefficient + "]";
	};

}
