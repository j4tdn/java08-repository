package view;

import java.util.Scanner;

import bean.Vehicle;
import utils.VehicleUtils;

public class Bai2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int a ,s, n  = 0;
		Vehicle v[] = null;
		
		do {
			System.out.println(" \n\n    ===================MENU===================");
			System.out.println("1. Nhập thông tin và tạo các đối tượng xe");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe. ");
			System.out.println("3. Thoát");
			System.out.println("Mời Bạn Chọn: ");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Bạn Muốn Nhập Bao Nhiêu Xe: "); 
				n = sc.nextInt();
				v = new Vehicle[n];
				for (int i = 0; i<n; i++) {
					s = i+1;
					System.out.println("Xe thứ "+s+": ");
					v[i] = new Vehicle();
					VehicleUtils.nhapXe(v[i]);
				}
				break;
			
			case 2:	
				System.out.format("%-25s%-20s%15s%25s%25s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá","Thuế phải nộp \n" );
				System.out.println("=============================================================================================");
				for (int i = 0; i < n ; i++) 
				{
					v[i].in();
				}
				break;

			default:
				flag = false;
				System.out.println("Tạm Biệt!!");
				break;
			}
		} while (flag);
	}

		
}
