package view;

import service.DepartmentService;

public class App {
	
	public static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentService();
	}
	
	public static void main(String[] args) {
		departmentService.getDepartment("mgm-dn");
	}
}
