package dao;

import persistence.jointable.Employee;

//import persistence.fkassociation.Employee;

public interface EmployeeDao {
	void save(Employee employee);
	Employee get(Integer id);
}
