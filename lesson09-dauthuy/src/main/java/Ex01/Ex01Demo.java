package Ex01;

public class Ex01Demo {
	public static void main(String[] args) {
		int amount = 11;
		Student[] students = createStudent(amount);
		System.out.println("Danh sách SV đăng ký học 1 lần trong năm 2020: ");
		Student[] listStudent = listOfRepeatStudents(students);
		print(listStudent);
		System.out.println("=======================");
		System.out.println("Danh sách SV chỉ học một lần và xếp loại A để khen thưởng:");
		Student[] list = eliteStudents(listStudent);
		print(list);
	}

	private static Student[] createStudent(int amount) {
		Student[] std = new Student[amount];
		std[0] = new Student("102", "Nam", "C");
		std[1] = new Student("104", "Hoàng", "D");
		std[2] = new Student("109", "Lan", "A");
		std[3] = new Student("103", "Bảo", "F");
		std[4] = new Student("105", "Nguyên", "B");
		std[5] = new Student("103", "Bảo", "F");
		std[6] = new Student("107", "Vũ", "F");
		std[7] = new Student("202", "Đạt", "C");
		std[8] = new Student("107", "Vũ", "C");
		std[9] = new Student("193", "Bảo", "B");
		std[10] = new Student("199", "Tài", "A");
		return std;
	}

	private static Student[] listOfRepeatStudents(Student[] students) {
		Student[] list = new Student[students.length];
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (contains(students, i)) {
				list[count++] = students[i];
			}
		}
		return list;
	}

	private static boolean contains(Student[] student, int index) {
		for (int i = 0; i < student.length; i++) {
			if (student[i].getCode().equals(student[index].getCode()) && i != index) {
				return false;
			}
		}
		return true;
	}

	private static Student[] eliteStudents(Student[] listStd) {
		int count = 0;
		for (Student std : listStd) {
			if (std != null) {
				count++;
			}
		}
		Student[] list = new Student[count];
		count = 0;
		for (int i = 0; i < list.length; i++) {
			if ("A".equals(listStd[i].getClassification())) {
				list[count++] = listStd[i];
			}
		}
		return list;
	}

	private static void print(Student[] std) {
		for (int i = 0; i < std.length; i++) {
			if (std[i] != null) {
				System.out.println(std[i]);
			} else {
				break;
			}
		}
	}
}