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

	public Department get(String id) {
		return departmentDao.get(id);
	}

	public Department getInSecondsLevelCache(String id){
		return departmentDao.getInSecondsLevelCache(id);
	}

	public Department getDepartmentByCriteriaQuery(String id){
		return departmentDao.getDepartmentByCriteriaQuery(id);
	}
}
