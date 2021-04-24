package service;

import dao.DepartmentDao;
import persistence.Department;

public class DepartmentService {
	private DepartmentDao dao;

	public DepartmentService() {
		dao = new DepartmentDao();
	}

	public Department get(String id) {
		return dao.get(id);
	}

	public Department getInTwoSession(String id) {
		return dao.getInTwoSession(id);
	}
	
	public Department getInSecondLevelCache(String id) {
		return dao.getInSecondLevelCache(id);
	}
	
	public Department getDepartment(String id) {
		return dao.getDepartment(id);
	}
}
