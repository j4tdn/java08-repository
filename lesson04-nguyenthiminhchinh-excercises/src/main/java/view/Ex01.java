package view;

import bean.Student;
import util.Ex01Util;

public class Ex01 {

	public static void main(String[] args) {
		Student sv1 = new Student(1, "Minh Chính", 10, 10);
		Student sv2 = new Student(2, "Thùy", 9, 10);
		
		int n=1;
		Student[] sv3 = new Student[n];
		System.out.println("Sinh viên " + (n+2) + " là:");
		Ex01Util.importSV(sv3);

		System.out.println("Danh sách sinh viên: ");
		System.out.format("%-25s%-20s%-15s%-25s%25s", "Mã sinh viên", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB\n");
		System.out.println(sv1);
		System.out.println(sv2);
		Ex01Util.export(sv3);

	}

}
