package bai4;

public class Math {
	public static void main(String[] args) {
		int a[] = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int temp = getLeastCommonMultiple(a);
		System.out.println(temp);
		
	}
	public static int getLeastCommonMultiple(int a[] ) {
		int temp = BCNN(a[0], a[1] );
        for(int i=2;i<5;i++){
            temp = BCNN(temp, a[i]);    
        }
        return temp;
	}
	public static int BCNN(int a, int b) {
		
		return (a*b/UCLN(a,b) );
	}
	public static int UCLN(int a, int b) {
		 if(a==b) return a;
		    if(a>b) 
		     return   UCLN(a-b,b);
		    else
		     return   UCLN(a,b-a);
			
		
	}
}