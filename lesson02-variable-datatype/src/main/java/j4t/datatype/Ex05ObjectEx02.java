package j4t.datatype;

public class Ex05ObjectEx02 {
	public static void main(String[] args) {
		//co bao nhieu cach tao doi tuong trong java
		Int x = new Int(88);
		Int y = new Int(44);
		swap(x, y);
		System.out.println("x :" + x);
		System.out.println("y :" + y);

	}

	private static void swap(Int a, Int b) {
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
		// TODO Auto-generated method stub
		return ""+ value;
	}

	private static int swap(int a, int b) {
		return a;
	}

}
