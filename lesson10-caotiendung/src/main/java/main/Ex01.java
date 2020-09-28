package main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1,3,2,4,3,3,9,6,7,6};		
		
		int[] tmp = removeDuplicate(numbers);
		Arrays.stream(tmp).forEach(t -> System.out.println(t));
		
		AverageHalf(numbers);;
		insertionSort(numbers);
		Arrays.stream(numbers).forEach(n -> System.out.println(n));
		
		System.out.println("=============================");
		System.out.println(findMaxByIndex(numbers,4));
		
	}
	
	private static int[] removeDuplicate(int[] numbers) {
		int c =0;
		for (int i =  0 ; i < numbers.length; i++) {
			int dem = 0;
			for (int j = 0; j < numbers.length; j ++) {
				if (i == j)	continue;
				if (numbers[j]==numbers[i]) {
					dem = dem +1;
				}
			}
			if (dem == 0) {
				numbers[c] = numbers[i];
				c++;
				
			}
		}
		
		int[] tmp = Arrays.copyOfRange(numbers, 0, c);
		return tmp;
		
	}
	
	private static void AverageHalf(int[] numbers) {
		double ave5First = Arrays.stream(Arrays.copyOfRange(numbers, 0, 5)).average().orElse(Integer.MIN_VALUE);
		double ave5Last = Arrays.stream(Arrays.copyOfRange(numbers, 5, numbers.length)).average().orElse(Integer.MIN_VALUE);
		String result = ave5First < ave5Last ? " < " : ave5First > ave5Last ? " > " : " = ";
		System.out.println("Ave5First"+ result +"Ave5Last");
			
	}
	
	private static int[] insertionSort(int[] numbers){
	
		for (int i =1 ; i< numbers.length;i++) {
			int valueToInsert = numbers[i];
			int holePosition = i;
			   while (holePosition > 0 && numbers[holePosition - 1] > valueToInsert) {
	                numbers[holePosition] = numbers[holePosition - 1];
	                holePosition--;
	                //System.out.println("Di chuyen phan tu: " + numbers[holePosition]);
	            }
			   if (holePosition != i) {
	               // System.out.println(" Chen phan tu: " + valueToInsert + ", tai vi tri: " + holePosition);
	                // chen phan tu tai vi tri chen
	                numbers[holePosition] = valueToInsert;
	            }
		}
       return numbers;
    } 
	
	private static int findMaxByIndex(int[] numbers,int index) {
		int n = numbers.length-1;
		while(index > 1) {
			if (numbers[n] == numbers[n-1]) {
				n = n-1;
			}else {
				n = n -1;
				index --;
			}
		}
		return numbers[n+1];
		
    } 
	
	

	
}
