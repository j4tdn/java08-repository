package baitap;

import java.util.Random;
import java.util.Scanner;

public class NumberHorseSaddle {
	public static int inputData(String s) {
		boolean check=true;
		int n=0;
		Scanner ib=new Scanner(System.in);
		do {
			try {
				System.out.print("Nhập "+s+" :");
				n=Integer.parseInt(ib.nextLine());
				if(n<=0) {
					System.out.println("nhập "+s+" > 0");
					check=true;
				}else {
					check=false;
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Đừng nhập bậy!!!");
				check=true;
			}
		}while(check);
		return n;
	}
	public static int timMin(int[][]arr,int n,int m) {
		int min=0;
		for(int i=0;i<n;i++) {
			min=arr[i][0];
			for(int j=0;j<m;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
		}
		return min;
	}
	public static int timMax(int[][]arr,int n,int m) {
		int max=0;
		for(int j=0;j<m;j++) {
			max=arr[0][j];;
			for(int i=0;i<n;i++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int n=inputData("n");
		int m=inputData("m");
		int [][] arr=new int[n][m];
		int kt=0;
		Random sc =new Random();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]= sc.nextInt(99)+1;
				System.out.print(arr[i][j]+" ");
				if(j==m-1) {
					System.out.print("\n");
				}
		    }
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==timMin(arr,n,m)&&arr[i][j]==timMax(arr,n,m)) {
					System.out.println(arr[i][j]+" là phần tử yên ngựa.");
					kt++;
				}
				
			}
		}
		if(kt==0) {
			System.out.println("Không có phần tử yên ngựa nào trong mảng.");
		}
		
	}

}
