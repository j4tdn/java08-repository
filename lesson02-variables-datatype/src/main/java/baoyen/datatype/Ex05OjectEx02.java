package baoyen.datatype;

public class Ex05OjectEx02 {

	public static void main(String[] args) {
		System.out.println("============");
		Int x = new Int(44);
		Int y = new Int(88);
		swap(x, y);
		System.out.println("x :" + x);
		System.out.println("y :" + y);

	}

	private static int swap(int a, int b) {
		return a;
	}

	private static void swap(Int a, Int b) {
		int tem = a.value;
		a.value = b.value;
		b.value = tem;
	}

}

class Int {
	public int value;

	public Int(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + value;

	}
}
