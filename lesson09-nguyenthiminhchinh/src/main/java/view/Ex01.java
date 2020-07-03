package view;

import bean.Student;

public class Ex01 {
	public static void main(String[] args) {
		int n = 4;
		Student[] s = new Student[n];
		s[0] = new Student("102", "Nam", "C");
		s[1] = new Student("104", "Hoang", "D");
		s[2] = new Student("109", "Lan", "B");
		s[3] = new Student("109", "Lan", "A");
		getStudents(s);
	}

	private static Student[] getStudents(Student[] s) {
		int temp = 1;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1; j++) {
				if ((s[i].getID().equals(s[j].getID())) && i != j) {
					temp++;
				}
				if (temp == 1) {
					System.out.println(s[i]);
				}
				temp = 1;
			}
		}
		return s;

	}

	private static Student[] getA(Student[] s) {
		//getStudents(s);
		Student[] st = new Student[s.length];
		int count = 0;
		for (int i = 0; i < st.length; i++) {
			if ("A".equals(s[i].getClassification())) {
				st[count++] = s[i];
			}
		}
		return st;
	}

}
