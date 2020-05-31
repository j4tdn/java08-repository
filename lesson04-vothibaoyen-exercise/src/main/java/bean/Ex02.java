package bean;

public class Ex02 {
	public static void main(String[] args) {
		int a[] = { 0, 3, 45, 35, 42, 9, 12, 15, 21, 14, 5,10,7};
		GomSo(a);
		
	}
	private static void GomSo(int a[]) {
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		int d[]=new int[a.length];
		int dem=0;
		int dem1=0;
		int dem2=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%7==0 && a[i]% 5!=0) {
				
				b[dem]=a[i];
				dem++;
			}
			if(((a[i]%7==0) && (a[i]%5==0))||((a[i]%7 !=0) && (a[i]%5 !=0)))
			 {
				c[dem1]=a[i];
				dem1++;
			}
			if(a[i]%5==0 && a[i]%7!=0) {
				d[dem2]=a[i];
				dem2++;
			}
		}
		for (int i = 0; i < dem; i++) {
			System.out.print(b[i]+"\t");
		}
		for (int i = 0; i < dem1; i++) {
			System.out.print(c[i]+"\t");
		}
		for (int i = 0; i < dem2; i++) {
			System.out.print(d[i]+"\t");
		}
		

	}

}
