package view;

public class EqualsDemo {
	public static void main(String[] args) {
		// primitive type
		int a = 10;
		int b = 5;
		System.out.println(a == b);

		Integer ia = 10;
		Integer ib = 500000000;
		Integer ic = 500000001;
		Integer id = new Integer(20);
		Integer ie = new Integer(20);

		System.out.println(ia == ib);
		System.out.println("ia code : " + System.identityHashCode(ia));
		System.out.println("ia code : " + System.identityHashCode(ib));
		System.out.println("ia code : " + System.identityHashCode(ic));
		System.out.println("ia code : " + System.identityHashCode(id));
		System.out.println("ia code : " + System.identityHashCode(ie));
		System.out.println("id = ie");

		String sa = "hello";
		String sb = "xinchao";
		System.out.println("sa == sb : " + sa == sb);
		System.out.println("sa == sb : " + sa.equals(sb));

	}
}
