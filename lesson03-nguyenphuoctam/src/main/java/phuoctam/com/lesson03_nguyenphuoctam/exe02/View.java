package phuoctam.com.lesson03_nguyenphuoctam.exe02;

import java.util.Random;
import java.util.Scanner;

public class View {
public static void main(String[] args) {
		Carriage xe1=new Carriage();
		int menu = 0;
		do {
			System.out.println("================================");
			menu = menu();
			switch (menu) {
			case 1:
				xe1=inputCarriage();
				System.out.println("lua chon 1");
				break;
			case 2:
				outputTaxDeclaration(xe1);
				System.out.println("lua chon 2");
				break;
			}
		} while (menu != 3);

	}

	private static void outputTaxDeclaration(Carriage carriage) {
		System.out.println(carriage.toString());
		
	}

	private static Carriage inputCarriage() {
		Carriage result= null;
		Random rd = new Random();
		String[] model={"sirius","wave"," alpha","exciter","future","ducati"};
		result = new Carriage(model[rd.nextInt(5)], rd.nextInt(50000000)+10000000, rd.nextInt(300)+50);
		result.setTax(result.getTax());
		result.setName("Nguyễn phước tâm");
		return result;
	}

	private static int menu() {
		int result = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Bạn có 3 lựa chọn");
		System.out.println("1.Nhập thông tin và tạo các đối tượng xe xe1,xe2,xe3");
		System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe");
		System.out.println("3.Thoát");
		System.out.print("Lựa chọn của bạn là : ");
		result = Integer.parseInt(ip.nextLine());
		return result;
	}
}
