

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập chuỗi có dấu:");
		String s =sc.nextLine();

		s = s.replaceAll("à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ", "a");
		s = s.replaceAll("è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ", "e");
		s = s.replaceAll("ì|í|ị|ỉ|ĩ", "i");
		s = s.replaceAll("ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ", "o");
		s = s.replaceAll("ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ", "u");
		s = s.replaceAll("ỳ|ý|ỵ|ỷ|ỹ", "y");
		s = s.replace("đ", "d");

		System.out.println(s);

	}

}
