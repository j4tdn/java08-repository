package view;

import persistence.Project;
import dao.EmployeeDao;
import persistence.Employee;

public class DemoFkAssiociation {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "lena@gamil.com", "na", "le");
		Employee emp2 = new Employee(2, "lella@gamil.com", "lla", "llle");
		Employee emp3 = new Employee(3, "bbella@gamil.com", "bblla", "bbllle");
		Project project1 = new Project(1, "p1", 100);
		Project project2 = new Project(2, "p2", 200);

		emp1.getProjects().add(project1);
		emp1.getProjects().add(project2);
		emp2.getProjects().add(project1);
		emp3.getProjects().add(project2);

//		project1.getEmployees().add(emp1);
//		project1.getEmployees().add(emp2);
//		project2.getEmployees().add(emp1);
//		project2.getEmployees().add(emp3);
		
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.save(emp1);
		employeeDao.save(emp2);
		employeeDao.save(emp3);
		System.out.println(emp1.getId());
		System.out.println(emp2.getId());
		System.out.println(emp3.getId());

	}
}
