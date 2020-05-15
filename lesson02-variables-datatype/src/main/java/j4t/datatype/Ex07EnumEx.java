package j4t.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {
	public static void main(String[] args) {
		// A(xA, yA)
		// R: 5, O(x0, y0)
		// Kiểm tra vị trí tương đối của A so với đường tròn
		// String: Trong, Trên, Ngoài

		Point A = new Point(3, 4);
		Point O = new Point(0, 0);
		int R = 5;
		
		CirclePosition pos = getPointStatusWithCircle(A, O, R);
		System.out.println("Result: " + pos.value);
	}

	// refactor
	private static CirclePosition getPointStatusWithCircle(Point A, Point O, int R) {
		double distance = Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
		return distance == R ? CirclePosition.ONSIDE 
				: distance < R ? CirclePosition.INSIDE 
						: CirclePosition.OUTSIDE ;

	}
}
