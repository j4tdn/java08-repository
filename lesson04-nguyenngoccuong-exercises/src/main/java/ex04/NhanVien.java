package ex04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NhanVien extends People {
	private LocalDate birthday;
	private String departmentName;

	public NhanVien() {
	}

	public NhanVien(LocalDate birthday, String departmentName) {
		super();
		this.birthday = birthday;
		this.departmentName = departmentName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public float getSalary() {
		return salaryCoefficient * 1250000;
	}

	@Override
	protected void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("---------- Nhan Vien ----------");
		super.input();

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		do {
			try {
				System.out.print("BirthDay (mm/dd/yyyy): ");
				this.setBirthday(LocalDate.parse(input.nextLine(), dateFormat));
			} catch (Exception e) {
				System.out.println("BirthDay is incorrect format!");
			}

		} while (this.getBirthday() == null);

		System.out.print("Department Name: ");
		do {
			this.setDepartmentName(input.nextLine());
		} while (this.getDepartmentName().trim().length() == 0);
	}

	@Override
	public String toString() {
		return "NhanVien [fullname=" + name + ", birthday=" + birthday + ", salaryCoefficient=" + salaryCoefficient
				+ ", departmentName=" + departmentName + "]";

	}
}
