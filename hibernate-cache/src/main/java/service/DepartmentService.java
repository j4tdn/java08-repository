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

	public Department getTwoSessions(String id) {
		return departmentDao.getTwoSessions(id);
	}
	
	public Department getSecondLevelCache(String id) {
		return departmentDao.getSecondLevelCache(id);
	}
	
	public Department queryCache(String id) {
		return departmentDao.queryCache(id);
	}
}
