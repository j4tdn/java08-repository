package staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
		printf("hello world");
		StaticDemo st=new StaticDemo();
		st.cout("bye");
		
	}
	
	private static void printf(String s) {
		System.out.println("Value:"+s);
		//cout(s);
	}
	private void cout(String s) {
		System.out.println("Value:"+s);
		printf(s);
	}
}
