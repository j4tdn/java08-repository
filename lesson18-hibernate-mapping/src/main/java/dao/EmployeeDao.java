package dao;

import persistence.jointable.Employee;

public interface EmployeeDao {
	void save(Employee employee);

	Employee get(Integer id);

}
