package Ex01;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;

public class App {
	
	private static final Random rd = new Random();
	
	public static void main(String[] args) {
		int[] arr = getArr();
		int length = arr.length;
		
		Arrays.stream(arr).forEach(t -> System.out.println(t));
		
		int n = removeDuplicateElements(arr, length);
		
		//1. 
		printArr(arr, n);
		
		//2.
		System.out.println(compare5ElInArray(arr));
		
		// 3. 
		insertionSort(arr);
		
		//4 . 
		System.out.println(arr[arr.length-3]);
		
		
		
		
		
	}
	
	private static void printArr(int[] arr, int n) {
		for(int i= 0 ;i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}	
	
	
	private static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
       
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	
	
	// get an array with 10 random el
	private static int[] getArr() {
		int[] arr = new int[10];
		
		for(int i =0 ; i<arr.length;i++) {
			arr[i] = rd.nextInt(11);
		}
		
		
		return arr ;	
	}
	
	//compare 5 first el and 5 last el in array
	private static int compare5ElInArray(int[] arr) {
		
		int left = 0 ;
		int right = 0;
		
		for(int i = 0 ;i<arr.length; i++) {
			if(i<5) {
				left += arr[i];
			}
			right += arr[i];
		}
		
		if(left > right ) {
			return 1; 
		}
		
		else if(left== right ) {
			return 0;
		}
		return -1 ;
		
	}
	
	// 
	private static void insertionSort(int arr[]) {  
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int el = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > el ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = el;  
        }  
    }  
	
	
	
}
