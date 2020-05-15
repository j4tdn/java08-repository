package staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printf(String s) {
		System.out.println("Values: "+s);
		//cout(s);
	}
	
	private void cout(String s) {// hafm no-static, thuoc pham vi cua doi tuong
		System.out.println("Values: "+s);
		printf(s);
	}

}
