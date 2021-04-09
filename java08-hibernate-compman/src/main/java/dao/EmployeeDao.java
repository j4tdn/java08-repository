package dao;

import java.util.List;

import persistence.Employee;

public interface EmployeeDao {
	public List<Employee> getListEmployee(String id);

}
