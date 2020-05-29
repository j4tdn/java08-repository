package execution;

public class Ex04 {
	public static void main(String[] args) {
	 Student[] st = new Student[5];
	 st[2] = new Student();
	 st[2].fulname = "CTD";
	 System.out.println(st[2].fulname);
		
	}
	
}
class Student{
	String fulname;
}
