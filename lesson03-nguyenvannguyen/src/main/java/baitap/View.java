package baitap;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Controller controller = new Controller();
		//controller.OutputView();
		Scanner ip = new Scanner(System.in);
		int n =0;
		Vehicle[] items =null;
		do {
			controller.OutputView();
			n = Integer.parseInt(ip.next());
			switch(n) {
			case 1: 
				System.out.println("bạn muốn nhập bao nhiêu chiếc xe? \n n = ");
				int k = Integer.parseInt(ip.next());
				items = new Vehicle[k];
				for(int i=0;i<items.length;i++) {
					items[i] = controller.InputData();
				}
				break;
			case 2: 
				System.out.println("Tên chủ xe            Loại xe        Dung tich        Tri gia          Thuế phải nộp");
				System.out.println("=====================================================================================");
				for(int i=0;i<items.length;i++) {
					controller.OutputData(items[i]);
				}
				break;
			}
		}while(n==3);
	}

}
