package Ex01;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student(102, "Nam", "C");
		students[1] = new Student(104, "Hoàng", "D");
		students[2] = new Student(109, "Lan", "A");
		students[3] = new Student(103, "Bảo", "F");
		students[4] = new Student(105, "Nguyên", "B");
		students[5] = new Student(107, "Vũ", "F");
		students[5] = new Student(103, "Bảo", "F");
		students[6] = new Student(202, "Đạt", "C");
		students[7] = new Student(107, "Vũ", "C");
		students[8] = new Student(193, "Bảo", "B");
		students[9] = new Student(199, "Tài", "A");
		
		StudentUtil.sortById(students);
		Student[] studentsRegistingOnce = new Student[students.length];
		Student[] studentExcellent = new Student[studentsRegistingOnce.length];
		
		studentsRegistingOnce = StudentUtil.getStudentsRegistingOnce(students);
		studentExcellent = StudentUtil.getStudentExcellent(studentsRegistingOnce);
		
		System.out.println("Student register one time");
 		for (Student student : studentsRegistingOnce) {
 			if (student != null) {
 				System.out.println(student);
 			}
 		}
 		
 		System.out.println("\nStudent excellent");
 		for (Student student : studentExcellent) {
 			if (student != null) {
 				System.out.println(student);
 			}
 		}
	}
}
