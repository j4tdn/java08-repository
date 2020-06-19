package util;

import java.util.Scanner;

import bean.Director;
import bean.Manager;
import bean.People;
import bean.Staff;

public class Ex04Utils {
	public static Scanner sc = new Scanner(System.in);

	public static void importDirector(Director d) {
		System.out.println("Nhập thông tin giám đốc: ");
		People p = new Director();
		p.importS(d);
	}
	
	public static void importManager(Manager m) {
		System.out.println("Nhập thông tin trưởng phòng: ");
		People p = new Manager();
		p.importS(m);
		System.out.println("Số lượng nhân viên quản lý:");
		int NumberOfStaff = Integer.parseInt(sc.nextLine());
		m.setNumberOfStaff(NumberOfStaff);
		
	}

	public static void importStaff(Staff... staffs) {
		System.out.println("Nhập thông tin nhân viên: ");
		for (int i = 0; i < staffs.length; i++) {

			System.out.println("Nhân viên thứ " + (i + 1));

			System.out.println("Họ tên:");
			String Name = sc.nextLine();

			System.out.println("Năm sinh:");
			int YearOfBirth = Integer.parseInt(sc.nextLine());

			System.out.println("Hệ số lương: ");
			float CoefficientsSalary = Float.parseFloat(sc.nextLine());

			System.out.println("Hệ số chức vụ: ");
			float CoefficientPosition = Float.parseFloat(sc.nextLine());

			System.out.println("Tên đơn vị:");
			String unitName = sc.nextLine();

			staffs[i] = new Staff(Name, YearOfBirth, CoefficientsSalary, CoefficientPosition, unitName);
		}
	}

	public static void exportStaff(Staff...staffs) {
		if (staffs.length == 0) {
			System.out.println("No information exits!!!");
		}
		for (Staff staff : staffs) {
			System.out.println(staff);
		}
	}

}
