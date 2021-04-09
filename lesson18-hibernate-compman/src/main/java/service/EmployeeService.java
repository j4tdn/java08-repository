package service;

import java.util.List;

import dao.EmployeeDao;
import persistence.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmps(String id) {
		return employeeDao.getEmps(id);
	}
}
