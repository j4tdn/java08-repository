package Bai2;

public class App {
	public static void main(String[] args) {
		
	}
	public static int getMissingNumber(int arr[]) {
		
		
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
		
		int missingNumber = 0;
		
		
		for(int i = 0; i<arr.length; i++) {
			if(i == 0) { 
				if(arr[i] != 1) {
					missingNumber = arr[i];
				}
			}
			else if(i == arr.length -1) {
				if(arr[i] != 100) {
					missingNumber = arr[i];
				}
			}
			else {
				if(arr[i] +1 != arr[i+1]) {
					missingNumber = arr[i] +1;
				}
			}
		}
		
		
		
		return missingNumber ;
	}
}
