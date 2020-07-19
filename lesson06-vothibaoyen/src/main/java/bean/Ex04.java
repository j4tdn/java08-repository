package bean;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		while(true) {
			input();
		}
		
	}
	private static void input() {
		int a=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.print("\nNhập số a = ");
				a=sc.nextInt();
				DocTen1(a);
			} catch (Exception e) {
				System.out.print("Moi nhap lai a : ");
			}

		} while (((a >= '0') && (a <= '9')));

	}
	private static void DocTen(char s) {
		if (s == '0') {
			System.out.print("Không ");
		} else if (s == '1') {
			System.out.print("Một ");
		} else if (s == '2') {
			System.out.print("Hai ");
		} else if (s == '3') {
			System.out.print("Ba ");
		} else if (s == '4') {
			System.out.print("Bốn ");
		} else if (s == '5') {
			System.out.print("Năm ");
		} else if (s == '6') {
			System.out.print("Sáu ");
		} else if (s == '7') {
			System.out.print("Bảy ");
		} else if (s == '8') {
			System.out.print("Tám ");
		} else if (s == '9') {
			System.out.print("Chín ");
		}

	}

	private static void DocTen1(int b) {
		String s = String.valueOf(b);
		if (s.length() == 1) {
			DocTen(s.charAt(0));
		}
		if (s.length() == 2) {
			String[] a = new String[3];
			if (s.charAt(0) == '1') {
				if (s.charAt(1) == '0') {
					System.out.print("Mười");
				} else {
					System.out.print("Mười ");
					DocTen(s.charAt(1));

				}
			} else  {
				if (s.charAt(1) == '0') {
					DocTen(s.charAt(0));
					System.out.print("Mươi");
				} else {
					DocTen(s.charAt(0));
					System.out.print("Mươi ");
					DocTen(s.charAt(1));
				}
			}
		}
		if (s.length() == 3) {
			if (s.charAt(1) == '0') {
				if (s.charAt(2) == '0') {
					DocTen(s.charAt(0));
					System.out.print("Trăm ");
				}else {
					DocTen(s.charAt(0));
					System.out.print("Trăm linh ");
					DocTen(s.charAt(2));
				} 
			}else {
				if (s.charAt(1) == '1') {
					if (s.charAt(2) == '0') {
						DocTen(s.charAt(0));
						System.out.print("Trăm Mười");
					} else {
						DocTen(s.charAt(0));
						System.out.print("Trăm Mười ");
						DocTen(s.charAt(2));

					}
				} else  {
					if (s.charAt(2) == '0') {
						DocTen(s.charAt(0));
						System.out.print("Trăm ");
						DocTen(s.charAt(1));
						System.out.print("Mươi");
					} else {
						DocTen(s.charAt(0));
						System.out.print("Trăm ");
						DocTen(s.charAt(1));
						System.out.print("Mươi ");
						DocTen(s.charAt(2));
					}
				}
			}

		}
	}
}