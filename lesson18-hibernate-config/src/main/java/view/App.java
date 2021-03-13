package view;

import java.util.List;

import dao.HibernateStudentDao;
import dao.StudentDao;
import persistence.GradeInfo;
import persistence.Student;

public class App {
	private static StudentDao studenDao;
	static {
		studenDao=new HibernateStudentDao();
	
	}
	public static void main(String[] args) {
//		studenDao.save(new Student(3,"Le","LeHoang","lehoang@gmail.com"));
//		List<Student> students =studenDao.getAll();
//		System.out.println("size: "+students.size());
		
//		List<GradeInfo> gradeInfo=studenDao.getGradeInfos();
//		System.out.println("size: "+gradeInfo.size());
		
		
		studenDao.delete(new Student(3,"Le","LeHoang","lehoang@gmail.com"));
		List<Student> students =studenDao.getAll();
		System.out.println("size: "+students.size());
	}
}
