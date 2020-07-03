package lesson09.exam;

public class ViewStudent {
	public static void main(String[] args) {
		Student[] students = {new Student(102,"Nam","C"),
				new Student(104,"Hoàng","D"),
				new Student(109,"Lan","A"),
				new Student(103,"Bảo","F"),
				new Student(105,"Nguyên","B")
				,new Student(107,"Vũ","F"),
				new Student(103,"Bảo","F"),
				new Student(202,"Đạt","C"),
				new Student(107,"Vũ","C"),
				new Student(103,"Bảo","B"),
				new Student(199,"Tài","A")};
		
		Controller item = new Controller();
		Student[] studentOneLearns = item.getStudents(students);
		Student[] studentA = item.getStudentsA(studentOneLearns);
		
		for(Student stu : studentOneLearns) {
			if(!stu.equals(null)) {
				System.out.println(stu);
			}
		}
	}

}
