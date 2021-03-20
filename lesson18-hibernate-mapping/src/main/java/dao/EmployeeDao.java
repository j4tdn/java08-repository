package dao;

import persistence.sharePk.Employee;

public interface EmployeeDao {
	void save(Employee employee);

	Employee get(Integer i);
}
