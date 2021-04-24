package view;

import service.DepartmentService;

public class App {

	private static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentService();
	}

	public static void main(String[] args) {
		// departmentService.getInTwoSession("mgm-dn");
		departmentService.getInSecondLevelCache("mgm-dn");
		System.out.println(departmentService.getById("mgm-by"));
	}

}
