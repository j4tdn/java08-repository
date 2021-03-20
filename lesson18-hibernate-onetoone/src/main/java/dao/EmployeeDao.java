package dao;

import persistence.sharedfk.Employee;

public interface EmployeeDao {
	void save(Employee employee);

	Employee get(Integer id);

}
