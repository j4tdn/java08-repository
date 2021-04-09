package view;

import persistence.Department;
import persistence.Employee;
import service.DepartmentService;
import service.EmployeeService;
import utils.HibernateUtil;

import java.util.List;
import java.util.Set;

public class App {
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;

    static {
        employeeService = new EmployeeService();
        departmentService = new DepartmentService();
    }

    public static void main(String[] args) {
//        List<Employee> employees = employeeService.getEmployees("mgm-dn");
//        System.out.println(employees);

        List<Department> departments = departmentService.getDepartments();
        System.out.println(departments);
    }
}
