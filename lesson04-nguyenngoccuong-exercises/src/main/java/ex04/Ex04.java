package ex04;

import java.util.Scanner;

public class Ex04 {

	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		GiamDoc giamDoc = new GiamDoc();
		TruongPhong truongPhong = new TruongPhong();
		NhanVien nhanVien1 = new NhanVien();
		NhanVien nhanVien2 = new NhanVien();
		
		giamDoc.input();
		truongPhong.input();
		nhanVien1.input();
		nhanVien2.input();
		
		System.out.println(giamDoc);
		System.out.println(truongPhong);
		System.out.println(nhanVien1);
		System.out.println(nhanVien2);
	}

}
