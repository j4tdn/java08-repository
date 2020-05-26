package bean;

public class Bai4 {

	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		System.out.println(" boi chung nho nhat cua 2 so la  "+getLeastCommonMultiple(a));

	}

	private static int UCLN(int a,int b) {
		if(a==0||b==0) {
			return a+b;
			
		}
		while (a != b){
	        if (a > b){
	            a -= b;
	        }else{
	            b -= a;
	        }
	    }
		return a;
	}
	private static int BCNN(int a,int b) {
		return (a*b)/UCLN(a, b);
	}
	private static int getLeastCommonMultiple(int a[]){
		int d=BCNN(a[0], a[1]);
		for(int i=2;i<a.length;i++) {
			d=BCNN(d, a[i]);			
		}
		return d;
	}
}
