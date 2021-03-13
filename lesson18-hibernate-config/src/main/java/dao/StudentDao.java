package dao;

import java.util.List;

import persistence.GradeInfo;
import persistence.Student;

public interface StudentDao {
	void save(Student student);
	
	void delete(Student student);
	
	List<Student> getAll();
	
	List<GradeInfo> getGradeInfos();
}
