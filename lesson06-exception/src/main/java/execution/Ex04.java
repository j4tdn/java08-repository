package execution;

public class Ex04 {
	public static void main(String[] args) {
		Student []st2=new Student[5];
		st2[2]=new Student();
		st2[2].fullname="lena";
		System.out.println("name: "+st2[2].fullname);
		/*
		 * Student st1=new Student(); st1.fullname="lena";
		 * System.out.println("name: "+st1.fullname);
		 */
	}
	

}
class Student{
	String fullname;
}
