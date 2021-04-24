package view;

import service.DepartmentService;

public class App {
    private static DepartmentService departmentService;

    static {
        departmentService = new DepartmentService();
    }

    public static void main(String[] args) {
//        departmentService.get("mgm-dn");
//        departmentService.getInTwoSessions("mgm-dn");
//        departmentService.getInSecondLevelCache("mgm-dn");
        System.out.println(departmentService.getDepartment("mgm-dn"));
    }
}
