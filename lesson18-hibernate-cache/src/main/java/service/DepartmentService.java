package service;

import dao.DepartmentDao;
import persistence.Department;

public class DepartmentService {
	
	private DepartmentDao departmentDao;
	
	public DepartmentService() {
		departmentDao = new DepartmentDao();
	}
	
	public Department get (String id) {
		return departmentDao.get(id);
	}
	
	public Department getInTwoSession (String id) {
		return departmentDao.get(id);
	}
	
	public Department getInTwoSessions (String id) {
		return departmentDao.get(id);
	}
	
	public Department getInDeconLevelCache (String id) {
		return departmentDao.getInSessionLevelCache(id);
	}
	
	public Department getDepartment(String id) {
		return departmentDao.getDepartment(id);
	}
	
}
