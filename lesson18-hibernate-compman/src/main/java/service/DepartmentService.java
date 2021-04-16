package service;

import java.util.List;

import dao.DepartmentDao;
import persistence.Department;

public class DepartmentService {
	public List<Department> getAllDepartment() {
		DepartmentDao dao = new DepartmentDao();
		List<Department> result = dao.getAllEmployeeByDepartment();
		return result;
	}
	
}
