package service;

import java.util.List;

import dao.EmployeeDao;
import dao.HibernateEmployeeDao;
import persistence.Employee;

public class EmployeeService {
	private static EmployeeDao employeeDao;
	static {
		employeeDao = new HibernateEmployeeDao();
	}

	public List<Employee> get(String id) {
		return employeeDao.get(id);
	}

	public List<Employee> getAll() {
		return employeeDao.getAll();
	}
}
