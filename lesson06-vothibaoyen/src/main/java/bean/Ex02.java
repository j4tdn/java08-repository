package bean;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		//MahocVien();
		//TenhocVien();
		//MatKhau();
		NgayThangNam();
	}

	private static void MahocVien() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			try {
				System.out.print("Nhập mã học viên  s = ");
				s = sc.nextLine();
				if (s.matches("^bkit-[0-9]{3}$") == true) {
					System.out.println("ma hoc vien: " + s);
				} else {
					System.out.println("moi nhap lai ma: ");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

		} while (true);
	}
	private static void TenhocVien() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			try {
				System.out.print("Nhập tên học viên  s = ");
				s = sc.nextLine();
				if (s.matches("^[\\p{L}\\s]{6,}$") == true) {
					System.out.println("ten hoc vien: " + s);
				} else {
					System.out.println("moi nhap lai ten: ");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

		} while (true);
	}
	private static void MatKhau() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			try {
				System.out.print("Nhập mật khẩu  s = ");
				s = sc.nextLine();
				if (s.matches("\\w*[A-Z]{1}[!@#$%^&*]{1}\\w*{8,63}") == true) {
					System.out.println("mat khau hoc vien: " + s);
				} else {
					System.out.println("moi nhap lai mat khau: ");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

		} while (true);
	}
	private static void NgayThangNam() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			try {
				System.out.print("Nhập ngay thang nam sinh  s = ");
				s = sc.nextLine();
				if (s.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
					System.out.println("ngay sinh hoc vien: " + s);
				} else {
					System.out.println("moi nhap lai ngay sinh: ");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

		} while (true);
	}
						
}