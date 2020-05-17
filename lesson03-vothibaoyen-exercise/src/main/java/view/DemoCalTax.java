package view;

import java.util.Scanner;


import bean.Vehicle;
import utils.CalTax;

public class DemoCalTax {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalTax cal1=new CalTax();
		Vehicle[] vehicles= new Vehicle[3];
		while (true) {
			System.out.println("-------------------memu-------------------");
			System.out.println("1.Nhập thông tin và tạo các đối tượng");
			System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("3.Thoát");
			System.out.println("moi ban chon: ");
			int a;			
			a=sc.nextInt();
			switch (a) {
			case 1:			
			    for(int i=0;i<3;i++) {
			    	vehicles[i]=cal1.nhaptt();
			    }
				break;
			case 2:
				System.out.format("%-25s%-20s%15s%25s%27s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá","Thuế phải nộp \n" );
				cal1.xuatdl(vehicles);
				break;
			case 3:
				return ;
				
			}
			
			
		}

	}

}
