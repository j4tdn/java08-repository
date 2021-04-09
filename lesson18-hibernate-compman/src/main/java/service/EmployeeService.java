package service;

import java.util.List;

import dao.EmployeeDao;
import dao.HibernateEmployeeDao;
import persistence.Employee;
import persistence.EmployeeDto;

public class EmployeeService {
	private static EmployeeDao employeeDao;
	static {
		employeeDao = new HibernateEmployeeDao();
	}

	public List<Employee> get(String id) {
		return employeeDao.get(id);
	}

	public List<EmployeeDto> getAll() {
		return employeeDao.getAll();
	}
}
