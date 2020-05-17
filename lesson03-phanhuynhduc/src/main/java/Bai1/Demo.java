package Bai1;

public class Demo {
	public static void main(String[] args) {
		
		Point A = new Point(6,9);
		
		
		Circle circle = new Circle(A,9);
		
		Point B = new Point(0,0);
		
		circle.check(B);
		
	}
}
