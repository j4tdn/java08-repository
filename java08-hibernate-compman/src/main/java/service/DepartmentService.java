package service;

import java.util.List;

import dao.HibernateDepartmentDao;
import persistence.Department;

public class DepartmentService {
	private HibernateDepartmentDao department;
	
	public DepartmentService() {
		department = new HibernateDepartmentDao();
		// TODO Auto-generated constructor stub
	}
	
	public List<Department> getDepartment(){
		return department.dept();
	}

}
