package staticDemo;

public class NumberExteral {

	public static void main(String[] args) {
		
		
		// non static  : object scope 
		
		Number n1 = new Number();
		n1.sum();
		
		// static : class scope 
		Number.sub();
	}
}
