package view;

import java.util.Scanner;

public class Ex04 {
	private static final Scanner ip = new Scanner(System.in);
	private static final String[] xmuoi = { " linh", " mười", " hai mươi", " ba mươi", " bốn mươi", " năm mươi",
			" sáu mươi", " bảy mươi", " tám mươi", " chín mươi" };

	/*
	 * private static final String[] haiSo = { "", " mười", " mười một",
	 * " mười hai", " mười ba", " mười bốn", " mười lăm", " mười sáu", " mười bảy",
	 * " mười tám", " mười chín" };
	 */
	private static final String[] tram = { " một trăm", " hai trăm", " ba trăm", " bốn trăm", " năm trăm", " sáu trăm",
			" bảy trăm", " tám trăm", " chín trăm" };

	private static final String[] motSo = { "không", " một", " hai", " ba", " bốn", " năm", " sáu", " bảy", " tám",
			" chín" };

	public static void main(String[] args) {
		input();
	}

	private static void input() {
		do {
			try {
				System.out.println("Enter number: ");
				int number = Integer.parseInt(ip.nextLine());
				readNumber(number);
			} catch (NumberFormatException e) {
				System.out.println("Please enter the valid number !!!");
			}

		} while (true);
	}

	private static void readNumber(int number) {
		String num = String.valueOf(number);
		int lnum = num.length();
		String k1, k2, k3;
		int d, d1, d2, d3;
		switch (lnum) {
		case 1:
			k1 = num.substring(lnum - 1, 1);
			d = Integer.parseInt(k1);
			System.out.println(motSo[d]);
			break;
		case 2:
			k1 = num.substring(lnum - 1, 1);
			System.out.println("k1" + k1);
			k2 = num.substring(lnum - 1, 1);
			System.out.println("k2" + k2);
			d1 = Integer.parseInt(k1);
			d2 = Integer.parseInt(k2);
			System.out.println("d1 " + d1 + "d2 " + d2);
			System.out.println(xmuoi[d1] + " " + motSo[d2]);
			System.out.println(xmuoi[d1]);
			break;
		case 3:
			k1 = num.substring(lnum - 1, 1);
			k2 = num.substring(lnum - 2, 1);
			k3 = num.substring(lnum - 3, 1);
			d1 = Integer.parseInt(k1);
			d2 = Integer.parseInt(k2);
			d3 = Integer.parseInt(k3);
			System.out.println(tram[d1] + "" + xmuoi[d2] + " " + motSo[d3]);
			break;
		default:
			break;
		}
	}
}
