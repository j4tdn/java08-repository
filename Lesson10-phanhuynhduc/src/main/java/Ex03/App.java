package Ex03;

import java.util.Arrays;
import java.util.Comparator;

public class App {
	public static void main(String[] args) {
		
		String[] arr = {   "special", "1","-1",null ,"special", "5",null,"a", "c"};
		
//		sort1(arr);
//		
		sort2(arr);
//		
		
		
	}
	
	private static void printArr(String[] arr) {
		Arrays.stream(arr).forEach(el -> System.out.println(el));
	}
	
	
	private static void sort1(String[] arr) {
		
		int n = arr.length ;
		
		// null is last
		for(int i= 0 ; i<n ; i++) {
			for(int j = 1; j<n-i;j++) {
				if(arr[j-1] == null ) {
					String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp ;
				}
			}
		}
		printArr(arr);
		
		for(int i = n-1; i>=1 ;i--) {
			for(int j = n-2; j>= n-1-i;j--) {
				if(arr[j+1] == null ) continue ;
				if(arr[j+1].equals("special")) {
					String temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp ;
				}
			}
		}
		printArr(arr);
		
		
		
//		// special  is first;
//		
//		  for(int i = n-1 ; i>= 0 ; i-- ) {
//			  for(int j = n-2 ; j<= n -1 - i ; j--) {
//				
//				
//				
//				
//				
//				if(arr[j+1] == null ) continue ;
//				
//				if(arr[j+1].equals("special")) {
//					String temp  = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp ;
////					
//				}
				
				
//				if(arr[j+1].equals("special")) {
//					String temp = arr[j];
//					arr[j+1] = arr[j]; 
//					arr[j] = temp ;
//				}
			//}
		//}
		
	//}
		
		
		//sort int in arr 
//		
		for(int i = 0 ;i<n ; i++) {
			for(int j = 1 ; j<n-i ; j++) {
				if(arr[j-1]== null || arr[j-1].equals("special") || arr[j] == null || arr[j].equals("special")) continue ;
				
				if(arr[j-1].compareTo(arr[j]) > 0) {
					String temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp ;
				}
			
			}
			
			
		}
		printArr(arr);
//		
	}
	
	
	private static void sort2(String[] arr) {
		
			int n = arr.length ;
	
		
		// null  is first;
		
	for(int i = n-1; i>= 0 ;i--) {
		for(int j = n-2; j>= n-1-i ;j--) {
			if(arr[j+1] == null ) {
				String temp = arr[j+1]; 
				arr[j+1] = arr[j];
				arr[j] = temp ;
			}
		}
	}
		printArr(arr);
		
		
		
		// special is last
		for(int i= 0 ; i<n ; i++) {
			for(int j = 1; j<n-i;j++) {
				
				if(arr[j-1] == null ) continue ;
				
				if(arr[j-1].equals("special")) {
					String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp ;
				}
			}
		}
		printArr(arr);
//		
//		
		//sort int in arr 
		
		for(int i = 0 ;i<n ; i++) {
			for(int j = 1 ; j<n-i ; j++) {
				if(arr[j-1] == null || arr[j].equals("special")) {
					System.out.println("no handle special");
					continue ;
				};
				
				if(arr[j-1].compareTo(arr[j]) < 0) {
					String temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp ;
				}
			
			}
			
			
		}
		printArr(arr);
//		
		
	}
	
	
	
}
