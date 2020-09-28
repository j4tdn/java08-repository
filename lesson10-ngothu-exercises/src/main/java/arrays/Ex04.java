package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int[] arrs = { 1, 4, 5, 3, 5, 7, 9, 2, 0 };
		addElement(arrs);
		removeElement(arrs);
	}
	
	private static void addElement(int[] arrs) {
		int k = 4;
		int arr=6;
		int[] arrays=new int[arrs.length+1];
		for(int i=0; i<k;i++) {
			arrays[i]=arrs[i];
		}
		arrays[k]=arr;
		for(int i=k;i<arrays.length-1;i++) {
			arrays[i+1]=arrs[i];
		}
		Arrays.stream(arrays).forEach(System.out::print);
		System.out.println();
		System.out.println("----------------");
		
	}
	private static void removeElement(int[] arrs) {
		int k = 4;
		int[] arrays=new int[arrs.length-1];
		for(int i=0; i<k;i++) {
			arrays[i]=arrs[i];
		}
		for(int i=k;i<arrays.length-1;i++) {
			arrays[i]=arrs[i+1];
		}
		Arrays.stream(arrays).forEach(System.out::print);
	}
	
	
}
