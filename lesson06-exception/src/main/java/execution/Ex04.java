package execution;

public class Ex04 {
	public static void main(String[] args) {
		Student[] student = new Student[5];//phai khoi tao dôi tuong truoc khi gan ten
		student[2]=new Student();
		student[2].fullname="lena";
		//student[1].fullname="lena";// sai
		//student.fullname = "lena";
		//System.out.println("name :" + student.fullname);
		System.out.println(student[2].fullname);
	}
}

class Student {
	String fullname;
}