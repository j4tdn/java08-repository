package dao;

import persistence.Employee;

//import persistence.fkassociation.Employee;

public interface EmployeeDao {
	void save(Employee employee);
	Employee get(Integer id);
}
