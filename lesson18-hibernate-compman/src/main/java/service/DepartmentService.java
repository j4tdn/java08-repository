package service;

import java.util.List;

import dao.DepartmentDao;
import persistence.Department;

public class DepartmentService {
	private static DepartmentDao departmentDao;

	public DepartmentService() {
		departmentDao = new DepartmentDao();
	}

	public List<Department> getAll() {
		return departmentDao.getAll();
	}

}
