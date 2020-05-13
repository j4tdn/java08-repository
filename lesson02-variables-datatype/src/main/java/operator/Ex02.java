package operator;

public class Ex02 {

	public static void main(String[] args) {
	int x = 5, y = 2, z = 3;
	y += x++ + z++ + ++z + ++x - y-- + z ;
	System.out.println(x + " " + y + " " + z);
	int a = 1;
	a = a + ++a + a++;
	System.out.println(a);
	}

}
