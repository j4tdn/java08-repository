package lambda;


//anonymous class= anonymous function= lambda
//using globle var(attribute) with no retiction
//using local var rewuire final for local var
public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int b;
	private  void test() {
		// local variable
		int a=10;
		
		Runnable runnable=()->{
			System.out.println(a);
			b=2;
			System.out.println(b);
		};
		runnable.run();
	}

}
