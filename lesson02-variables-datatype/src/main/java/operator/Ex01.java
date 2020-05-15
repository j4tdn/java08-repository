package operator;

public class Ex01 {
	public static void main(String[] args) {
		int n = 7;
		System.out.println(n++);
		System.out.println(n++);
		System.out.println(++n);

		boolean type = n % 2 == 0;
		
		if(type) {
			System.out.println("So chan");
		}
		
		if(!type) {
			System.out.println("So le");
		}
	}
}
