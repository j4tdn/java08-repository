package service;

import java.util.List;

import dao.EmployeeDao;
import persistence.Employee;

public class EmployeeService {
	public List<Employee> getAllByDepartmentId(String id) {
		EmployeeDao dao = new EmployeeDao();
		List<Employee> result = dao.getAllEmployeeByDepartmentId(id);
		return result;
	}
	
	public List<Employee> getAllEmployee() {
		EmployeeDao dao = new EmployeeDao();
		List<Employee> result = dao.getAllEmployee();
		return result;
	}
}
