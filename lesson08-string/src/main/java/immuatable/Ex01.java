package immuatable;

public class Ex01 {

	public static void main(String[] args) {
		// String literal : vd String s = "asdd"; duoc luu o constant pool
		String l1 = "hello";
		String l2 = "hello";
		System.out.println("isEquals VALUE: " + l1.equals(l2));
		System.out.println("isEquals VALUE: " + l1 == l2);
		// == so sanh dia chi, so sanh o stack
		//class final khong cho ke thu

		// String object : vd String s = new String("sdas");
		String o1 = new String("wellcom");
		String o2 = new String("wellcom");
		o2 = new String("hello");
//		o2 = "hello";
		o2 = "to";
		System.out.println("isEquals VALUE: " + o1.equals(o2));
		System.out.println("isEquals VALUE: " + o1 == o2);

	}

}
