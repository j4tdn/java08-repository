package Bai1;

import java.util.Scanner;

public class App {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student phd = new Student(69,"Phan Huynnh Duc", 6, 9);
		
		Student nthv = new Student(96, "Mario Goteze ", 9,6);
		
		Student sv3 = nhapSV3();
		
		System.out.println(phd.toString());
		System.out.println(nthv.toString());
		System.out.println(sv3.toString());
		
		
	}
	
	public static Student nhapSV3() {
		
		Student sv3 = new Student();
		
		System.out.println("Moi nhap id");		
		sv3.setId(sc.nextInt());
		
		System.out.println("Moi nhap ten :");
		sv3.setName(new Scanner(System.in).nextLine());
		
		System.out.println("Nhap diem LT");
		sv3.setDiemLT(new Scanner(System.in).nextFloat());
		
		System.out.println("Nhap diem TH: ");
		sv3.setDiemTH(new Scanner(System.in).nextFloat());
		
		
		
		
		return sv3;
		
		
	}
	
	
}
