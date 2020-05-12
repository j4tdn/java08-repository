package operator;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * int n = 7 ; System.out.println(n++); System.out.println(n++);
		 * System.out.println(++n); boolean type = n%2 ==0 ;
		 */
		int a = 1, b=2;
		
//		b = ++a + a++;
		a = a + ++a +a++;
		System.out.println(a);
		System.out.println(b);
		
	}

		
}
