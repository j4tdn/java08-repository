package View;

import java.util.Scanner;

import Bean.Student;

public class Bai1 {

	public static void main(String[] args) {
		Student sv1 = new Student(123, "Trang", 5, 7);
		Student sv2 = new Student(124, "Yen", 7, 8);
		Student sv3 = new Student();
		Nhap(sv3);
		Student[] sv = {sv1,sv2,sv3};
		PointTB(sv);
		Xuat(sv);
	}

	public static void PointTB(Student[] student) {
		float t = 0;
		for (int i = 0; i < student.length; i++) {
			t = (student[i].getPointLT() + student[i].getPointTH()) / 2;
			student[i].setPointTB(t);
		}
	}

	public static void Nhap(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ma SV: ");
		student.setId(sc.nextInt());

		System.out.print("Ho ten SV: ");
		student.setName(sc.next());

		System.out.print("Diem LT: ");
		student.setPointLT(sc.nextFloat());

		System.out.print("Diem TH: ");
		student.setPointTH(sc.nextFloat());
	}

	public static void Xuat(Student[] students) {
		System.out.format("%15s %20s %15s %15s %15s", "ma sinh vien", "ho ten ", "diem LT", "diem TH", "diem TB\n");
		System.out.println("=====================================================================================");
		for (Student student : students) {
			student.xuat1();
		}
	}
}
