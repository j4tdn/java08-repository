package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Ex02 {
	public static void main(String[] args) {
		int[][] arrs= {{1,2,3,4},{5,6,8,7},{1,9,0,9},{2,9,6,5},{1,2,4,5}};
		matrixTransformation(arrs);
	}
	private static void matrixTransformation(int[][] arrs) {
		
		HashSet<Integer> rowset=new HashSet<Integer>();
		HashSet<Integer> colset=new HashSet<Integer>();
		
		for(int row=0; row<arrs.length;row++) {
			for (int col=0; col <arrs[row].length;col++) {
				if(arrs[row][col]==0) {
					rowset.add(row);
					colset.add(col);
				}
			}
		}
		
		for (Integer e : rowset) {
			for(int col=0;col<arrs.length-1;col++) {
				arrs[e][col]=0;
			}
			
		}
		for (Integer e : colset) {
			for(int row=0;row<arrs.length;row++) {
				arrs[row][e]=0;
			}
		}
		
		printf(arrs);
		
	}
	private static void printf(int[][] arrs) {
		for(int row=0;row<arrs.length;row++) {
			for(int col=0;col<arrs[row].length;col++) {
				System.out.print(arrs[row][col]);
			}
			System.out.println();
		}
	}
	
}
