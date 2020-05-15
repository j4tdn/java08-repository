package staticdemo;

public class staticEx {
	public static void main(String[] args) {
		// non-static obj scope
		Number number = new Number();
		number.sum();
		// static class scope
		Number.sub();
		

	}
}
