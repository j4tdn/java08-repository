package Bai1;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		int arr[] = { 2,4,4,5,6,3,5,7} ;
		
		getUniqueNumbers(arr);
	}
	
	public static int[] getUniqueNumbers(int arr[]) {
			
		
		
		//sort arr 
		int temp ;
		for(int i=0;i<arr.length-1 ;i++ ) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]  = arr[j];
					arr[j] = temp ;
				}
			}
			
		}
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(i == 0) {
				if(arr[i] != arr[i+1]) {
					System.out.println("Phan tu chi xuat hien 1 lan : " + arr[i]);
				}
			}
			
			else if(i ==arr.length -1) {
				if(arr[i] != arr[i-1]) {
					System.out.println("Phan tu chi xuat hien 1 lan : " + arr[i]);
				}
			}
			
			else {
				if(arr[i] != arr[i+1] && arr[i] != arr[i-1]) {
					
					System.out.println("Phan tu chi xuat hien 1 lan la : " +arr[i]);
				}
			}
		}
		return arr;
		
		
		
		
		
	}
	
}
