package Bai3;

import java.util.Random;
import java.util.Scanner;

public class DuoiNgua {
	
	private int[][] arr ;
	private int m ;
	private int n;
	
	public DuoiNgua() {
		
	}
	public DuoiNgua(int m, int n) {
		this.m = m;
		this.n = n;
		this.arr = new int[m][n];
		
	}
	
	public int getN() {
		return this.n;
		
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public void input() {
		
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int phanTu = 1+rd.nextInt(99);
		
		
		for(int i=0;i<this.m;i++) {
			for(int j=0;j<this.n;j++) {
				
				while(true) {
					System.out.println("Nhap phan tu thu a[" + i+j+"] : (1-99) :");
					int pt = sc.nextInt();
					
					if(pt>1 && pt<99) {
						this.arr[i][j] = pt ;
						break;
					}
					
					
				}
				
			}
		}
	}
	public void output() {
		for(int i = 0; i<this.m;i++) {
			for(int j = 0; j<this.n ; j++) {
				
				System.out.print("arr"+ "[" +i+ j +"] =" + arr[i][j] +"\t");
				//System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void check() {
		for(int i=0;i<this.m ; i++) {
			for(int j=0;j<this.n;j++) {
				if(this.checkCot(i, j) && this.checkHang(i,j)) {
					System.out.println("mang 2 chieu co phan tu duoi ngua la : a "+"["+i+j+"]" +this.arr[i][j]);
				}
			}
		}
	}
//	public static checkPT(int pt) {
//		
//	}
	public boolean checkCot(int p, int d) {
		// max in column
		Boolean isTrue = true;
		
		for(int i=0;i<this.m ;i++) {
			if(this.arr[p][d] < this.arr[i][d]) {
				isTrue = false;
				break;
			}
			
		
		}
		return isTrue;
	}
	public boolean checkHang(int p, int d) {
		// min in row 
		
		Boolean isTrue = true;
		
		for(int j = 0; j<this.n;j++ ) {
				
			if(this.arr[p][d] > this.arr[p][j] ) {
				isTrue = false;
				break;
			}	
		}
		return isTrue;
	
}
}
