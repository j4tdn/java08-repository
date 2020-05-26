package Ex04;

public class Ex04 {

	public static void main(String[] args) {
		int[] arr = {3, 9, 18};
		System.out.println(getLeastCommonMultiple(arr));

	}
	public static int getLeastCommonMultiple(int[] arr) {
		int temp = bcnn(arr[0], arr[1]);
		for (int i = 2; i < arr.length - 1; i++) {
			temp = ucln(temp, arr[i]);
			
		}
		return temp;
	}
	public static int bcnn(int a, int b) {
		return (a*b)/ucln(a, b);
	}
	public static int ucln(int a, int b) {
		if(a == b) return a;
		if(a > b) return ucln(a-b,b);
		else return ucln(a, b-a);
	}
	

}
