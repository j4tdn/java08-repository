package operator;

public class Ex01 {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(n++);
		System.out.println(n++);
		System.out.println(n);
		
		boolean type = n%2 == 0;
		if (!type) System.out.println("le");
		else System.out.println("chan");
		
		int a=1;
		a=a + ++a + a++;
		System.out.println(a);
		//System.out.println(b);
		
	}

}
