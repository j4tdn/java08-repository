package service;

import dao.EmployeeDao;
import persistence.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService() {
        employeeDao = new EmployeeDao();
    }

    public List<Employee> getEmployees(String deptId) {
        return employeeDao.getEmployees(deptId);
    }
}
