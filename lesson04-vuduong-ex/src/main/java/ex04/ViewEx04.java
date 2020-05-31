package ex04;

import java.time.LocalDate;
import java.time.Month;

public class ViewEx04 {
	public static void main(String[] args) {
		People director = new Director("Quyen Phan", 1995, 4.5, 3.6);
		People headDepartment = new HeadDepartment("Le Teo", 1996, 4.0, 10);
		People employee1 = new Employee("Huy Vu", LocalDate.of(1997, Month.OCTOBER, 10), 3.5, "IT");
		People employee2 = new Employee("Quy Nhi", LocalDate.of(1997, Month.OCTOBER, 20), 3.5, "Accountant");
		
		System.out.println(director);
		System.out.println(headDepartment);
		System.out.println(employee1);
		System.out.println(employee2);
	}
}
