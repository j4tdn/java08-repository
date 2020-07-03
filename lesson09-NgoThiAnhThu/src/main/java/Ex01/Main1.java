package Ex01;

public class Main1 {
	public static void main(String[] args) {
		Student st1 = new Student("102", "Nam", "C");
		Student st2 = new Student("104", "Hoàng", "D");
		Student st3 = new Student("109", "Lan", "A");
		Student st4 = new Student("103", "Bảo", "F");
		Student st5 = new Student("105", "Nguyên", "B");
		Student st6 = new Student("107", "Vũ", "F");
		Student st7 = new Student("103", "Bảo", "F");
		Student st8 = new Student("202", "Đạt", "C");
		Student st9 = new Student("107", "Vũ", "C");
		Student st10 = new Student("193", "Bảo", "B");
		Student st11 = new Student("199", "Tài", "A");

		Student[] sts = { st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11 };

		System.out.println("Danh sách sinh viên đăng ký học năm 2020: ");
		printListStudent(sts);
		System.out.println("Danh sách sinh viên học 1 lần:   ");
		print(studentStudyOneTimes(sts));
		System.out.println("Danh sách sinh viên học 1 lần được điểm A:  ");
		print(oneTimesGradeA(sts));

	}

	private static void printListStudent(Student[] sts) {

		for (Student st : sts) {
			System.out.println(st);
		}

		for (int i = 0; i < sts.length; i++) {

		}

	}

	private static Student[] studentStudyOneTimes(Student[] sts) {
		Student[] list = new Student[sts.length];
		int count = 0;
		for (int i = 0; i < sts.length; i++) {
			if (contains(sts, i)) {
				list[count++] = sts[i];
			}
		}
		return list;
	}

	private static boolean contains(Student[] student, int index) {
		for (int i = 0; i < student.length; i++) {
			if (student[i].getMssv().equals(student[index].getMssv()) && i != index) {
				return false;
			}
		}
		return true;
	}

	private static void print(Student[] sts) {
		for (Student st : sts) {
			if (st != null) {
				System.out.println(st);
			} else {
				break;
			}
		}
	}

	private static Student[] oneTimesGradeA(Student[] sts) {
		Student[] stus = studentStudyOneTimes(sts);
		Student[] list = new Student[stus.length];
		for (int i = 0; i < stus.length; i++) {
			if ("A".equals(stus[i].getScore())) {
				list[i] = stus[i];
			}
		}

		return sts;
		

	}

}
