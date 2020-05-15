package view;

import java.util.Random;
import java.util.Scanner;

import utils.Utils3;

public class Bai3 {
	public static void main(String[] args) {
		 	int soDong, soCot;
		    Scanner scanner = new Scanner(System.in);
		    Random rd = new Random();
		    System.out.println("Nhập vào số dòng của mảng: ");
		    soDong = scanner.nextInt();
		    System.out.println("Nhập vào số cột của mảng: ");
		    soCot = scanner.nextInt();
		    
		    int[][] A = new int[soDong][soCot];
		    
		    for (int i = 0; i < soDong; i++) {
		        for (int j = 0; j < soCot; j++) {
		            A[i][j] = rd.nextInt(99)+1;
		        }
		    }
		    
		    Utils3.inMang(A);
		    Utils3.yenNgua(A);
	}
	
		
}
