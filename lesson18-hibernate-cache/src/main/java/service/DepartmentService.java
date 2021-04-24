package service;

import dao.DepartmentDao;
import persistence.Department;

public class DepartmentService {

	private DepartmentDao departmentDao;

	public DepartmentService() {
		departmentDao = new DepartmentDao();
	}

	public Department get(String id) {
		return departmentDao.get(id);
	}
	
	public Department getInTwoSession(String id) {
		return departmentDao.getInTwoSession(id);
	}
	
	public Department getInSecondLevelCache(String id) {
		return departmentDao.getInSecondLevelCache(id);
	}

	public Department getById(String id) {
		return departmentDao.getById(id);
	}
	
}
