package service;

import java.util.List;

import dao.HibernateEmployeeDao;
import persistence.Employee;

public class EmployeeService {
	private HibernateEmployeeDao employee;
	public EmployeeService() {
		employee = new HibernateEmployeeDao();
		// TODO Auto-generated constructor stub
	}
	
	public List<Employee> getEmployeeByDepartment(String id){
		return employee.getListEmployee(id);
	}

}
