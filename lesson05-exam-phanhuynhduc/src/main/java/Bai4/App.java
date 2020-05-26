package Bai4;

public class App {
	public static void main(String[] args) {
		int arr[]  = {1,2,4,5} ;
		System.out.println(getLeastCommonMultiple(arr));
	}
	public static int UCLN(int a, int b) {
		if(a==b) {
			return a ;
		}
		if(a>b) {
			return UCLN(a-b, b);
		}
		else {
			return UCLN(a,b-a);
		}
	}
	public static int BCNN(int a, int b) {
		return (a*b)/UCLN(a,b);
	}
	
	public static int getLeastCommonMultiple(int arr[]) {
		int temp = BCNN(arr[0], arr[1]);
		for(int i=2; i< arr.length;i++) {
			temp = BCNN(temp,arr[i]);
			
		}
		
		return temp ;
	}
	
}	
