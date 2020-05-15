package j4t_datatype;

public class Ex05Obj {
	public static void main(String[] args) {
		Int a = new Int(88);
		System.out.println("hasdcode a : " + System.identityHashCode(a));
		Int b = new Int(44);
		System.out.println("hasdcode b : " + System.identityHashCode(b));

		swap(a, b);
		System.out.println("a : " + a);
		System.out.println("hasdcode a : " + System.identityHashCode(a));
		System.out.println("b : " + b);
		System.out.println("hasdcode b : " + System.identityHashCode(b));

	}

	private static void swap(Int a, Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}

	private static int swap(int a, int b) {
		return a;
	}
}

class Int {
	public int value;

	public Int(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
