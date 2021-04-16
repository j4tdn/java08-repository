package dao;

import java.util.List;

import persistence.Employee;

public interface EmployeeDao {
	List<Employee> get(String id);	
	
	List<Employee> getAll();	
}
