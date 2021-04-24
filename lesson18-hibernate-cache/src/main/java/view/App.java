package view;

import service.DepartmentService;

public class App {
	private static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentService();
		
	}
	
	public static void main(String[] args) {
//		departmentService.get("mgm-dn");
		
	//	departmentService.getInSecondLevelCache("mgm-dn");
		
		var dept  = departmentService.getDepartment("mgm-dn");
		System.out.println(dept);
	}
	
}
