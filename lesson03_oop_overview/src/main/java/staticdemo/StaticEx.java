package staticdemo;

public class StaticEx {
	public static void main(String[] args) {
		// non-static obj scope
		Number number = new Number();
		number.sum();
		// static class scope
		Number.sub();
		

	}

}
