package Bai1;

import java.util.Scanner;

public class App {
	
	
	
	public static void main(String[] args) {
		
		while(true) {
			
			try {
				
				inputData();
				
				break;
				
				 
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		
		}
		
		
		
		
		
		
	}
	
	
	public static void inputData() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("moi ban nhap vao he so a : " );
		
		int a  = sc.nextInt();
		
		System.out.println("moi ban nhap vao he so b " );
		
		int b = sc.nextInt();
		
		if(a == 0 && b !=0 ) {
			System.out.println(" phuong trinh khong co nghiem ");
		}
		
		else if(b == 0) {
			throw new DivZeroException(" mau so khong the bang 0 duoc ");
					
		}
			
		else {
			System.out.println(" nghiem cua phuong trinh la : " +(-b/a));
		}
	}
	
}
