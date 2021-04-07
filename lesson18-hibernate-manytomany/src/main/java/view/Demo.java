package view;

import dao.EmployeeDao;
import persistence.Employee;
import persistence.Project;

public class Demo {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "e1@gmail.com", "e1", "e1");
		Employee emp2 = new Employee(2, "e2@gmail.com", "e2", "e2");
		Employee emp3 = new Employee(3, "e3@gmail.com", "e3", "e3");

		Project pro1 = new Project(1, "P1", 100);
		Project pro2 = new Project(2, "P2", 200);

		emp1.getProjects().add(pro1);
		emp1.getProjects().add(pro2);
		// emp2.getProjects().add(pro1);
		// emp3.getProjects().add(pro2);

//		pro1.getEmployees().add(emp1);
//		pro1.getEmployees().add(emp2);
//
//		pro2.getEmployees().add(emp1);
//		pro2.getEmployees().add(emp3);

		EmployeeDao dao = new EmployeeDao();
		dao.save(emp1);
		dao.save(emp2);
		dao.save(emp3);
	}
}
