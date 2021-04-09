package service;

import java.util.List;

import dao.EmployeeDAO;
import persistence.Employee;

public class EmployeeService extends EmployeeDAO {
	private static EmployeeDAO employeeDAO;
    static {
    	employeeDAO = new EmployeeDAO();
    }
	public List<Employee> getAllEmployeesByDeptId(String deptId){
		return employeeDAO.getAllEmployeesByDeptId(deptId);
	}

}
