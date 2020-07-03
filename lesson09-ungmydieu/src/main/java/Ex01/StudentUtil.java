package Ex01;

public class StudentUtil {
	public static Student[] sortById(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) 
			for (int j = i + 1; j < students.length; j++)
			{
				if (students[i].getId() > students[j].getId())
				{
					Student temp = new Student();
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		return students;	
	}
	
	public static Student[] getStudentsRegistingOnce(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		
		if (students[0].getId() != students[1].getId()) {
			result[count] = students[0];
			count++;
		}	
		
		if (students[students.length - 1].getId() != students[students.length - 2].getId()) {
			result[count] = students[students.length - 1];
			count++;
		}
		
		for(int i = 1; i < students.length - 1; i++) {
			if (students[i].getId() != students[i-1].getId() 
					&& students[i].getId() != students[i+1].getId()) {
				result[count] = students[i];
				count++;
			}
		}		
		return result;
	}
	
	public static Student[] getStudentExcellent(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		
		for (Student student : students) {
			if (student != null && student.getRank().equals("A")) {
				result[count] = student;
				count++;
			}
		}		
		return result;
	}
}
