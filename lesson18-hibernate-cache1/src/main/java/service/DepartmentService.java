package service;

import dao.DepartmentDao;
import persistence.Department;

public class DepartmentService {
	private static DepartmentDao departmentDao; 
	
	public DepartmentService() {
		departmentDao = new DepartmentDao();
		
		
		// TODO Auto-generated constructor stub
	}
	
	public Department get(String id) {
		return departmentDao.get(id);
	}
	
	public Department getInTowSession(String id) {
		return departmentDao.getInTwoSessions(id);
	}
	
	public Department getInSecondLevelCache(String id) {
		return departmentDao.getInSecondLevelCache(id);
	}

}
