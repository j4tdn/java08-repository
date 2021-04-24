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
		
		public Department getIntwoSessions(String id) {
			return departmentDao.getIntwoSessions(id);
			
		}
		public Department getInSecondLevelSessions(String id) {
			return departmentDao.getInSecondLevelSessions(id);
			
		}
		public Department getDepartment(String id) {
			return departmentDao.getDepartment(id);
			
		}
		
}
