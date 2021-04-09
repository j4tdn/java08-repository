package view;

import dao.EmployeeDao;
import persistence.Employee;
import persistence.Project;

public class Demo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Vu", "Duong", "vu123@gmail.com");
		Employee emp2 = new Employee(1, "Vu2", "Duong2", "vu456@gmail.com");
		Employee emp3 = new Employee(1, "Vu3", "Duong3", "vu789@gmail.com");

		Project pro1 = new Project(1, "Viet", 200);
		Project pro2 = new Project(2, "My", 500);

		emp1.getProjects().add(pro1);
		emp1.getProjects().add(pro2);

		emp2.getProjects().add(pro1);
		emp3.getProjects().add(pro2);

//		pro1.getEmployees().add(emp1);
//		pro1.getEmployees().add(emp2);
//		
//		pro2.getEmployees().add(emp1);
//		pro2.getEmployees().add(emp3);
		
		EmployeeDao employeeDao = new EmployeeDao();
		
		employeeDao.save(emp1);
		employeeDao.save(emp2);
		employeeDao.save(emp3);


	}
	
}