package Ex01;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(102, "Dau Thuy", 10, 7);
		Student sv2 = new Student(103, "Thien An", 9, 9.5f);
		Student sv3 = new Student();
		System.out.println("Nhập thông tin sinh viên 3: ");
		StudentUtils.input(sv3);
		Student[] students = {sv1, sv2, sv3};
		
		System.out.format("%-20s %-25s %-20s %-20s %-20s", "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");
		System.out.println("\n==================================================================================================");
		StudentUtils.ListStudent(students);
	}
}
