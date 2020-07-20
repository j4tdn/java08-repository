package ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		System.out.println(convert(15));

	}

	private static String convert(int digit) {
		String result = "";
		String[] number = { "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };

		int tmp = digit;
		int hangDonVi;
		int hangChuc;
		int hangTram;
		hangTram = tmp / 100;
		hangChuc = (tmp % 100) / 10;
		hangDonVi = tmp % 10;

		// Hang Tram
		for (int i = 0; i < number.length; i++) {
			if (i == (hangTram - 1)) {
				result = result + number[i] + " Trăm ";
			}
		}
		// Hang chuc
		for (int i = 0; i < number.length; i++) {
			if (hangTram != 0 && hangChuc == 0 && hangDonVi == 0) {
				break;
			}
			if (hangTram != 0 && hangChuc == 0) {
				result = result + " Lẻ ";
				break;
			}
			if (hangChuc == 1) {
				result = result + " Mười ";
				break;
			}
			if (i == (hangChuc - 1)) {
				result = result + number[i] + " Mươi ";
			}
		}
		// hang don vi
		for (int i = 0; i < number.length; i++) {
			if (i == (hangDonVi - 1)) {
				if(hangDonVi == 5 && hangChuc!= 0) {
					result = result + " lăm";
				} else {
					result = result + number[i];

				}
			}
		}

		return result;
	}
}
