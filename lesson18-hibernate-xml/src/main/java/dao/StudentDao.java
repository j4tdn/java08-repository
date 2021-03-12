package dao;

import java.util.List;

import persistence.Student;

public interface StudentDao {
	void save(Student student);
	List<Student> getAll();
}
