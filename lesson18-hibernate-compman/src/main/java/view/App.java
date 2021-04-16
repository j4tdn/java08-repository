package view;

import persistence.Department;
import persistence.Project;
import persistence.ProjectDto;
import service.DepartmentService;
import service.EmployeeService;
import service.ProjectService;

import java.util.List;

public class App {
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static ProjectService projectService;

    static {
        employeeService = new EmployeeService();
        departmentService = new DepartmentService();
        projectService = new ProjectService();
    }

    public static void main(String[] args) {
//        List<Employee> employees = employeeService.getEmployees("mgm-dn");
//        System.out.println(employees);

//        List<Department> departments = departmentService.getDepartments();
//        System.out.println(departments);
//        System.out.println("========================3======================");
//        List<Project> projects = projectService.getProjects(400);
//        projects.forEach(System.out::println);

        System.out.println("==================4=================");
        List<ProjectDto> proBudgets = projectService.getProBudgets();
        proBudgets.forEach(System.out::println);
    }
}
