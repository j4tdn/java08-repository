package view;

import service.DepartmentService;

public class view {
	private static DepartmentService departmentService;
	static {
		departmentService = new DepartmentService();
	}
	
	//HQL/JPQL: Table: department (id name)
	//			Entity: Department ( deptId, deptName)
	//NativeQuery
	//CriteriaQuery
	
	public static void main(String[] args) {
//		departmentService.get("mgm-dn");
//		departmentService.getInTwoSession("mgm-dn");
		System.out.println(departmentService.getDepartment("mgm-dn"));
	}
}
