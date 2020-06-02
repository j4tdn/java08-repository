package execution;

public class Ex04 {
		public static void main(String[] args) {
			
			// gia tri mac dinh cua doi tuong student la null;
			
			Student[] students = new Student[5];
			
			
			
			//Student student = null;
			
			students[2] = new Student();
			
			students[2].fullname = " hello le na";
			
			//student.fullname = "Le Na";
			
			//System.out.println("Name : " +student.fullname);
		}
}



class Student {
	 String fullname ;
}
