package ex01;

public class Demo {

	
	// cat chuoi
	// duyet mang

	public static Student[] getListStudent(Student[] students) {
		Student[] list = new Student[students.length];
		int count = 1;
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					count++;
				}
			}
			if ((count == 1)&&(students[i].getScore().equalsIgnoreCase("A"))) {
				list[i] = students[i];
			}
			count = 1;
		}

		
		
		return list;
	}
	
	public static void main(String[] args) {
		Student[] students = { new Student("123", "Nam", "F"), new Student("123", "Nam", "F"),
				new Student("120", "Nam", "A"), new Student("122", "Na", "B"), new Student("127", "Man", "A"),
				new Student("126", "My", "B"), new Student("124", "Ny", "C"), new Student("133", "Nu", "A") };
		print(students);
	}
	
	
	
	public static void print(Student[] students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
	
}
