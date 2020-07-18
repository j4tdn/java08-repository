package ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập sô(Tối đa 9 chữ số) : ");
		try {
			// đọc số
			number = scanner.nextInt();
			if (number == 0) {
				System.out.print("Số bằng chữ: Không");
			} else {
				System.out.print("Số bằng chữ: " + numberToWord(number));
			}
		} catch (Exception e) {
			System.out.println("Vui lòng nhập số hợp lệ");
		}
		scanner.close();
	}

	private static String numberToWord(int number) {
		String words = "";
		String unitsArray[] = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
				"mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín" };
		String tensArray[] = { "không", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi",
				"chín mươi" };

		if (number == 0) {
			return "không";
		}
// Thêm dấu trừ nếu số nhỏ hơn 0
		if (number < 0) {
			//Chuyển số thành chuỗi
			String numberStr = "" + number;
			// remove minus before the number
			numberStr = numberStr.substring(1);
			
			return "trừ " + numberToWord(Integer.parseInt(numberStr));
		}
		//kiểm tra số chia hết cho 1 triệu không
		if ((number / 1000000) > 0) {
			words += numberToWord(number / 1000000) + " triệu ";
			number %= 1000000;
		}
		//kiểm tra số chia hết cho 1 ngàn không
		if ((number / 1000) > 0) {
			words += numberToWord(number / 1000) + " nghìn ";
			number %= 1000;
		}
		//kiểm tra số chia hết cho 1 trăm không
		if ((number / 100) > 0) {
			words += numberToWord(number / 100) + " trăm ";
			number %= 100;
		}

		if (number > 0) {
			// kiểm tra số có nằm trong hàng mười mấy không
			if (number < 20) {
				//lấy giá trị từ mảng hàng đơn vị
				words += unitsArray[number];
			} else {
				//lấy giá trị từ mảng hàng chục
				words += tensArray[number / 10];
				if ((number % 10) > 0) {
					words += " " + unitsArray[number % 10];
				}
			}
		}
		return words;
	}
}
