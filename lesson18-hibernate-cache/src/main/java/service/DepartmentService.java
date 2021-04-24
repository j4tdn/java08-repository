package service;

import dao.DepartmentDao;
import persistence.Department;

public class DepartmentService {
	private DepartmentDao departmentDao;

	public DepartmentService() {
		// TODO Auto-generated constructor stub
		departmentDao = new DepartmentDao();
	}

	public Department get(String id) {
		return departmentDao.get(id);
	}
	
	public Department getInTwoSession(String id) {
		return departmentDao.getInSecondLevelCache(id);
	}
	
	public Department getInSecondLevelCache(String id) {
		return departmentDao.getInSecondLevelCache(id);
	}
	
	public Department getDepartment(String id) {
		return departmentDao.getDepartment(id);
	}
}
