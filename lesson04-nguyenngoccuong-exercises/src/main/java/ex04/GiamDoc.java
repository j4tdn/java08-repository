package ex04;

import java.util.Scanner;

public class GiamDoc extends People {

	private int birthYear;
	private float positionCoefficient;

	public GiamDoc() {
	}

	public GiamDoc(int birthYear, float positionCoefficient) {
		super();
		this.birthYear = birthYear;
		this.positionCoefficient = positionCoefficient;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public float getSalary() {
		return (salaryCoefficient + positionCoefficient) * 3000000;
	}

	@Override
	protected void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("---------- Giam Doc ----------");
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
				System.out.print("Position Coefficient: ");
				this.setPositionCoefficient(Float.parseFloat(input.nextLine()));
				if (this.getPositionCoefficient() <= 0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Position Coefficient must be a positive integer!");
			}
		} while (this.getPositionCoefficient() <= 0);
	}

	@Override
	public String toString() {
		return "GiamDoc [fullname=" + name + ", birthYear=" + birthYear + ", salaryCoefficient=" + salaryCoefficient
				+ ", positionCoefficient=" + positionCoefficient + "]";
	}

}
