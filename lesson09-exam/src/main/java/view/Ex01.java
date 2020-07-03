package view;


import bean.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student[] st = new Student[4];
		st[0] = new Student(102, "Nam", "F");
		st[0] = new Student(104, "Hong", "A");
		st[0] = new Student(102, "Nam", "C");
		st[0] = new Student(103, "Lan", "D");
		getStudents(st);
		getStudentsA(st);
	}

	private static Student[] getStudents(Student[] st) {
		Student[] stc = new Student[st.length];
		int dem = 1;
		for (int i = 0; i < st.length-1; i++) {
			for (int j = i+1; j<st.length; j++) {
				if (st[i].getMaso()<st[j].getMaso()) {
					Student t = new Student();
					t = st[i];
					st[i] = st[j];
					st[j] = t;
				}
			}
		}

		for (int i = 1; i < st.length; i++) {
			if (st[i].getMaso() == st[i + 1].getMaso()||st[i-1].getMaso() == st[i].getMaso()) {
				dem++;
			} 
			else {
				for(int k=0;i<stc.length;k++) {
					stc[k]=st[i];
					
				}
			}
		}
		return stc;
	}
	private  static Student[] getStudentsA(Student[] st) {
		Student[] stc = new Student[st.length];
		getStudents(st);
		for(int i=0;i<st.length;i++) {
			if(st[i].getXeploai().equals("A")) {
				for(int k=0;i<stc.length;k++) {
					stc[k]=st[i];
					
				}
				
			}
		}
		return stc;
	}

}
