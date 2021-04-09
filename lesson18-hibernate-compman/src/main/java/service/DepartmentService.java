package service;

import java.util.List;

import dao.DepartmentDao;
import dao.EmployeeDao;
import persistence.Department;
import persistence.Employee;

public class DepartmentService {
	private DepartmentDao departmentDao;

	public DepartmentService() {
		// TODO Auto-generated constructor stub
		departmentDao = new DepartmentDao();
	}

	public List<Department> getAll() {
		return departmentDao.getAll();
	}
}
