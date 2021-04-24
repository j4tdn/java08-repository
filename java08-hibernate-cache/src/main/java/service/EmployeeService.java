package service;

import java.util.List;

import dao.EmployeeDao;
import persistence.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		employeeDao = new EmployeeDao();
	}
	
	public List<Employee> getEmployeeByDepartmentId (String id){
		return employeeDao.getAllByDepartmentId(id);
	}
}
