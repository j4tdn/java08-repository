package dao;

import java.util.List;

import persistence.Employee;
import persistence.EmployeeDto;

public interface EmployeeDao {
	List<Employee> get(String id);	
	
	List<EmployeeDto> getAll();	
}
