package phd.datatype;

public class Ex05object02 {

	public static void main(String[] args) {
		Int x = new Int(88);
		Int y = new Int(44);
		swap(x,y);
		System.out.println(x);
		System.out.println(y);
		//có bao nhiêu cách tạo đối tượng trong JAVA
	}
	@SuppressWarnings("unused")
	private static int swap(int a, int b )
	{
		return a;
	}
	private static void swap(Int a , Int b )
	{
		int tmp =a.value ;
		a.value = b.value;
		b.value =tmp;
	}
	
}
class Int {
	public int value ; 
	public Int(int value ) {
		this.value=value;
	}
	public String toString() {
		return ""+value ;
	}
	
}
