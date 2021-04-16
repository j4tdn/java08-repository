package view;

import dao.EmployeeDao;
import persistence.Employee;
import persistence.Project;

public class Demo {
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDao();
		Employee emp1 = new Employee(1, "a@gmail.com", "a", "b");
		Employee emp2 = new Employee(2, "b@gmail.com", "b", "a");
		Employee emp3 = new Employee(3, "c@gmail.com", "c", "c");

		Project pro1 = new Project(1, "P1", 1000);
		Project pro2 = new Project(2, "P2", 1000);

		emp1.getProject().add(pro1);
		emp1.getProject().add(pro2);
		emp2.getProject().add(pro1);
		emp3.getProject().add(pro1);
//
//		pro1.getEmployees().add(emp1);
//		pro1.getEmployees().add(emp2);
//		pro1.getEmployees().add(emp3);
//		pro2.getEmployees().add(emp1);

		dao.save(emp1);
		dao.save(emp2);
		dao.save(emp3);

	}
}
