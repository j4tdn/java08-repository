package view;

import dao.EmployeeDao;
import persistence.Department;
import persistence.Employee;
import service.DepartmentService;
import service.EmployeeService;

import utils.HibernateUtil;

public class App {


	// first level cache nam trong pham vi cua SESSION




	private static DepartmentService departmentService;


	static {
		departmentService = new DepartmentService();
	}

	public static void main(String[] args) {
//		departmentService.get("mgm-dn");
		//departmentService.getInSecondsLevelCache("mgm-dn");

		Department department = departmentService.getDepartmentByCriteriaQuery("mgm-mu");
		System.out.println(department);
	}
}
