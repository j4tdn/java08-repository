package lamda;

//annonymous class = annonymous function = lamda
//using global var (attribute) with no restriction
//using local var: require final for local var

public class LocalVariable {
	private int b = 100;
	public static void main(String[] args) {
		
	}
	
	private void test() {
		//loccal variable
		int a = 10;
		
		Runnable runnable = () -> {
		//	a = 100;
			System.out.println(a);
			
			b = 10;
			System.out.println(b);
		};
		
		runnable.run();
	}
	
//	private void test1() {
//		a = 100;
//	}
}
