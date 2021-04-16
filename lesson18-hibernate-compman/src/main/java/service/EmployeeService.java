package service;

import java.util.List;

import dao.EmployeeDao;
import persistence.Employee;

public class EmployeeService {
	private static EmployeeDao employeeDao;
	
	public EmployeeService() {
		employeeDao = new EmployeeDao();
	}
	
	public List<Employee> getEmployeesByDepartmentId(String deptId) {
		return employeeDao.getEmployeesByDepartmentId(deptId);
	}
	
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

}
