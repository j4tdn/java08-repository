package Ex05;

import java.util.Arrays;
import java.util.Comparator;

public class App {
	public static void main(String[] args) {
		
		Student[] students = new Student[] {
				new Student("phd",20), new Student("hello",69),
				new Student("hi", 30)
		};
		
		
		
		
	}
	
	private static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 0 ;i < arr.length; i++) {
			for(int j = 1 ; j < n-i ;j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp ;
				}
			}
		}
	}
	
	private static void selectionSort(int[] arr) {
		   for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j; 
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	}
	
	
	   private static void insertionSort(int arr[]) {  
	        int n = arr.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = arr[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( arr [i] > key ) ) {  
	                arr [i+1] = arr [i];  
	                i--;  
	            }  
	            arr[i+1] = key;  
	        }  
	    }  
	   
	   private static void objectSort(Student[] stds) {
		   
		  Arrays.sort(stds,Comparator.comparing(Student::getName).thenComparing(Student::getAge));
		   
		   
		  
	   }
	   
	   
	   
	
	
}
