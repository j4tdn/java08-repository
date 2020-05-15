package j4t.datatype;

public class Ex05ObjectEx02 {
	
	public static void main(String[] args) {
		int a=44;
		int b=88;
		a=swap(b, b=a);
		System.out.println("a\t"+a+"\tb\t"+b);
		System.out.println("=====================");
		Int x= new Int(44);
		Int y = new Int(88);
		swap(x, y);
		System.out.println("x\t"+x+"\ty\t"+y);
	}
	
	private static void swap(Int a, Int b) {
		int temp=a.value;
		a.value=b.value;
		b.value=temp;
	}
	
	private static int swap(int a, int b) {
		return a;
	}
}

class Int {
	public int value;
	public Int(int value) {
		this.value= value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value+"";
	}
	
}
