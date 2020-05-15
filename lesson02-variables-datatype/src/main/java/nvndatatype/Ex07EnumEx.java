package nvndatatype;

import java.awt.Point;

import common.CirlePosition;

public class Ex07EnumEx {
	public static void main(String[] args) {
		int R = 5; 
		
		Point A = new Point(4, 4);
		Point O = new Point(0, 0);
		
		CirlePosition pos =  (getPointStatusWithCirle(A,O, R));
		System.out.println("Result: "+ pos.value);
	}
	public static CirlePosition getPointStatusWithCirle(Point A, Point O, int R) {
		double d= Math.sqrt(Math.pow(A.x- O.x, 2) + Math.pow(A.y- O.y, 2 ) );
		return d == R ? CirlePosition.ONSIDE 
				: d < R ? CirlePosition.INSIDE 
						: CirlePosition.OUTSIDE;
		
	}
}