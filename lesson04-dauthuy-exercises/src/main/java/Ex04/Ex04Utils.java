package Ex04;

import java.util.Scanner;

public class Ex04Utils {
	public static Scanner sc = new Scanner(System.in);

	public static void inputDirectory(Director directory) {
		System.out.println("\nNhap thong tin giam doc: ");
		
		System.out.print("Ten: ");
		String fullName = sc.nextLine();
		directory.setFullName(fullName);

		System.out.print("Nam sinh: ");
		int yearBirth = Integer.parseInt(sc.nextLine());
		directory.setYearBirth(yearBirth);

		System.out.print("He so luong: ");
		float coefficientSalary = Float.parseFloat(sc.nextLine());
		directory.setCoefficientSalary(coefficientSalary);

		System.out.print("He so chuc vu: ");
		float coefficientPosition = Float.parseFloat(sc.nextLine());
		directory.setCoefficientPosition(coefficientPosition);
	}
	
	public static void inputManager(Manager manager) {
		System.out.println("\nNhap thong tin truong phong: ");

		System.out.print("Ten: ");
		String fullName = sc.nextLine();
		manager.setFullName(fullName);

		System.out.print("Nam sinh: ");
		int yearBirth = Integer.parseInt(sc.nextLine());
		manager.setYearBirth(yearBirth);

		System.out.print("He so luong: ");
		float coefficientSalary = Float.parseFloat(sc.nextLine());
		manager.setCoefficientSalary(coefficientSalary);
		
		System.out.print("So luong nhan vien quan ly: ");
		int numberEmployees = Integer.parseInt(sc.nextLine());
		manager.setNumberEmployees(numberEmployees);
	}
	
	public static void inputEmployee(Employee[] employees) {
		System.out.println("\nNhap thong tin nhan vien: ");
		
		for (int i = 0; i < employees.length; i++) {
			
			System.out.print("Ten: ");
			String fullName = sc.nextLine();

			System.out.print("Nam sinh: ");
			int yearBirth = Integer.parseInt(sc.nextLine());

			System.out.print("He so luong: ");
			float coefficientSalary = Float.parseFloat(sc.nextLine());
			
			System.out.print("Ten don vi: ");
			String nameDepartment = sc.nextLine();
			
			System.out.println();
			
			employees[i] = new Employee(fullName, yearBirth, coefficientSalary, nameDepartment);
		}
	}
	
	public static void export(Employee[] employees) {
		System.out.print("\nNhan vien: ");
		if (employees.length == 0) {
			System.out.println("No Information");
		}
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
}
