package bai01;

public class main {
	public static void main(String[] args) {
		Student[] students = new Student[15];
		students[0] = new Student(102, "Nam", "C");
		students[1] = new Student(104, "Hoàng", "D");
		students[2] = new Student(109, "Lan", "A");
		students[3] = new Student(103, "Bảo", "F");
		students[4] = new Student(105, "Nguyên", "B");
		students[5] = new Student(107, "Vũ", "F");
		students[6] = new Student(103, "Bảo", "F");
		students[7] = new Student(202, "Đạt", "C");
		students[8] = new Student(107, "Vũ", "C");
		students[9] = new Student(193, "Bảo", "B");
		students[10] = new Student(199, "Tài", "A");

		Student[] students2 = new Student[10];
		students2 = getStudentOnce(students);
		if (students2.length == 0) {
			System.out.println("no student study once !!");
		} else {
			System.out.println("danh sach sinh vien chi hoc mot lan : ");
			for (Student student : students2) {
				System.out.println(student.toString());
			}
		}
		System.out.println("hoc sinh duoc khen thuong : ");
		Student[] students3 = new Student[10];
		students3 = getStudentA(students2);
		for (Student student : students3) {
			System.out.println(student.toString());
		}

	}

	public static Student[] getStudentOnce(Student[] students) {
		Student[] studentOnce = new Student[10];
		int x = 0;
		boolean check = true;
		for (int i = 0; i < students.length; i++) {
			check = true;
			for (int j = 1; j < students.length; j++) {
				if (i == j) {
					break;
				} else {
					if (students[i].getId() == students[j].getId()) {
						check = false;
						break;
					}
				}
			}
			if (check) {
				studentOnce[x] = students[i];
				x++;
			}
		}
		return studentOnce;
	}

	public static Student[] getStudentA(Student[] students) {
		Student[] studentA = new Student[10];
		int x = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getXepLoai().equals("A")) {
				studentA[x] = students[i];
				x++;
			}
		}
		return studentA;
	}
}
