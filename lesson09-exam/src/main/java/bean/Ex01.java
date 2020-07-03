package bean;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Student st1 = new Student(102, "Nam", "C");
		Student st2 = new Student(103, "Hoang", "D");
		Student st3 = new Student(109, "Lan", "A");
		Student st4 = new Student(104, "Vu", "F");
		Student st5 = new Student(105, "Bao", "A");
		Student st6 = new Student(103, "Hoang", "C");

		Student[] st = { st1, st2, st3, st4, st5, st6 };
		hoc1Lan(st);
		

	}

	public static void hoc1Lan(Student[] st) {
		int n = st.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (st[i].getMSV() == st[j].getMSV()) {
				
					for (int k =j+1; k < n-1; k++) {

						st[k-1] = st[k];
						n--;
					}
				}
			}
		}
		for (Student student : st) {
			System.out.println(student);
		}

	}

}
