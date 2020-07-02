package mutable;

public class Ex01 {
	public static void main(String[] args) {
		// transient
		StringBuilder buidler = new StringBuilder();
		System.out.println("b1:" + System.identityHashCode(buidler));
		buidler.append("Ruby").append("Python").reverse();
		System.out.println("b2:" + System.identityHashCode(buidler));

		// setValueAt, deleteAt
		buidler.deleteCharAt(0);
		System.out.println("value:" + buidler);

	}

}
