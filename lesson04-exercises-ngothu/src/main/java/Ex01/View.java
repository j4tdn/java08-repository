package Ex01;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		List_Student();
	}

	public static void List_Student() {
		Student st1 = new Student(1, "Ngô Văn A", 7, 9);
		Student st2 = new Student(2, "Nguyễn Văn B", 8, 7);
		System.out.println(st1);
		System.out.println(st2);
		Student st3 = new Student();
		InPut(st3);
		System.out.println(st3);
	}

	public static void InPut(Student st3) {
		Scanner sc = new Scanner(System.in);
		st3.setId(Integer.parseInt(sc.nextLine()));
		st3.setFullname(sc.nextLine());
		st3.setTheory(sc.nextFloat());
		st3.setPractice(sc.nextFloat());
	}
}
