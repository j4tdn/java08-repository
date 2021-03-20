package dao;

import persistence.sharepk.*;

public interface EmployeeDao {
	void save(Employee employee);
	
	Employee get(Integer id);
}
