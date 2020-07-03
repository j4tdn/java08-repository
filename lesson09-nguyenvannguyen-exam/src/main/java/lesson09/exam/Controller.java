package lesson09.exam;

public class Controller {
	public Student[] getStudents(Student[] stu) {
		Student[] students = new Student[stu.length] ;
		int count = 0;
		for(int i=0;i<stu.length;i++) {	
			for(int j=0;j<stu.length;j++) {
				if(stu[i].getId()==stu[j].getId() && i!=0) {
					continue;
				}else {
					students[count]= new Student(stu[i].getId(), stu[i].getName(), stu[i].getRank());
					count++;
				}
			}
		}
		return students;
	}
	public Student[] getStudentsA(Student[] students) {
		Student[] studentA = new Student[students.length];
		int count = 0;
		for(int i = 0 ; i<students.length;i++) {
			if(students[i].getRank().equals("A")) {
				studentA[count++] = new Student(students[i].getId(), students[i].getName(), students[i].getRank());
			}
		}
		
		return studentA;
	}

}
