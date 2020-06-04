package Bai2;

public class App2 {
	public static void main(String[] args) {
		
		int[] array = sort(3,14,5,69,10,11,35,7,10);
		
		for(int a: array) {
			System.out.print(a +"\t");
		}
	}
	public static int[] sort(int ...arr) {
		
		int [] arr2 = new int[arr.length];
		
		int bay = 0;
		int nam = arr.length - 1; 
		
		for(int i=0;i<arr.length ; i++) {
			
			if(arr[i] %7 ==0 && arr[i] %5 !=0) {
				arr2[bay] = arr[i];
				bay ++;
			}
			if(arr[i] %7 !=0 && arr[i] %5 ==0 ) {
				
				arr2[nam] = arr[i];
				nam --;
			}
					
		}
		int khong = bay;
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i] %7 ==0 && arr[i] %5 ==0 ||arr[i] %7 !=0 && arr[i] %5 !=0 ) {
				arr2[bay] = arr[i];
				bay ++;
			}
		}
		
		
		
		
				
		return arr2 ;
	}
}
