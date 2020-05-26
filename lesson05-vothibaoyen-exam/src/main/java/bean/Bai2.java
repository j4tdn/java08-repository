package bean;

public class Bai2 {
	public static void main(String[] args) {
    int a[]= {1,2,3,4,5,7};
    System.out.println(getMissingNumber(a));
	}
	private static int getMissingNumber(int a[]) {
		int b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b) {
				return b;
			}
			b++;
		}
		return b;
	}
}
