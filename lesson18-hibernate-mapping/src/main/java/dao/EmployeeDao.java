package dao;

import persistence.sharepk.Employee;

public interface EmployeeDao {
	void save(Employee employee);

	Employee get(Integer i);
}
