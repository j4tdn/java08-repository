import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai2 {
	private static final Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(" Ma hoc vien: " + InputMaHV());
		System.out.println("Ten: " + InputTen());
		System.out.println("Mat khau: " + InputMatKhau());
		System.out.println(InputNgayThangNS());

	}

	public static int inputInt() {

		do {
			try {
				return Integer.parseInt(ip.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number!!!");

			}

		} while (true);

	}

	private static String InputMaHV() {
		String s = "bkit-";
		String t = null;
		System.out.println("nhap ma hoc vien 3 chu so");
		do {
			try {
				t = Integer.toString(inputInt());
				KiemTraDoDaiXau(t, 3);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (true);
		return s += t;
	}

	private static String InputTen() {
		System.out.println("moi nhap ten:");
		String s = null;
		do {
			try {
				s = ip.nextLine();
				IsNumberSpecial(s);
				KiemTraDoDaiXau2(s, 6);
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		return s;

	}

	public static String InputMatKhau() {
		System.out.println("nhap mat khau co it nhat 1 ki tu in hoa va 1 ki tu dac biet");
		String s = null;
		do {
			try {
				s = ip.nextLine();
				IsUp(s);
				KiemTraDoDaiXau3(s);
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		return s;

	}

	public static String InputNgayThangNS() {
		System.out.println("nhap ngay thang nam theo dinh dang dd.MM.YYY");
		String s = null;
		do {
			try {
				s = ip.nextLine();
				KiemtraNgayThang(s);
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		return s;

	}

	public static void KiemtraNgayThang(String s) {
		String t = null;
		String month = null;
		int i = 0;

		do {
			if (Character.toString(s.charAt(i)).equals(".")) {
				t = s.substring(0, i);
				break;
			}
			i++;
		} while (true);

		for (int j = lenght() - 1; j > 0; j--) {
			if (Character.toString(s.charAt(j)).equals(".")) {
				month = s.substring(i + 1, j);
				System.out.println(month);
				break;

			}
		}

	}

	private static int lenght() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void IsUp(String s) throws Exception {

		if (!s.matches(".*[!@#$%^&*].*") || !s.matches(".*[A-Z].*"))
			throw new Exception("moi nhap lai mat khau co it nhat 1 ki tu in hoa va 1 ki tu dac biet ");

	}

	public static void IsNumberSpecial(String s) throws Exception {
		String t = s.replaceAll("\\s", "");
		if (!t.matches(".*[A-Za-z].*"))
			throw new Exception("moi nhap lai ten khong chua so va ki tu dac biet");
	}

	public static void KiemTraDoDaiXau(String t, int n) throws Exception {
		if (t.length() != n) {
			throw new Exception("moi nhap lai ma hoc vien " + n + " chu so");
		}
	}

	public static void KiemTraDoDaiXau2(String t, int n) throws Exception {
		if (t.length() < n) {
			throw new Exception("moi nhap lai ten co it nhat " + n + " chu cai");
		}
	}

	public static void KiemTraDoDaiXau3(String t) throws Exception {
		if (t.length() < 8 || t.length() > 63) {
			throw new Exception("moi nhap lai ten co it nhat 8 va nhieu nhat 63 ki tu");
		}
	}

}
