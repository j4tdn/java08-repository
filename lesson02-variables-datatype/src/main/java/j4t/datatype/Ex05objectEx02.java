package j4t.datatype;

public class Ex05objectEx02 {

	public static void main(String[] args) {
		Int x = new Int(88);
		Int y = new Int(44);
		Swap(x, y);
		System.out.println("x:" + x);
		System.out.println("y:" + y);

	}

	private static int swap(int a, int b) {
		return a;
	}

	private static void Swap(Int a, Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
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
