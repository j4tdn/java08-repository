package j4t.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {
	public static void main(String[] args) {
		// A(xA; yA)
		// R :5

		Point A = new Point(3, 4);
		Point O = new Point(0, 0);

		CirclePosition pos = checkLocation(A, O, 5);
		System.out.println("Result: " + pos.value);

	}

	public static CirclePosition checkLocation(Point A, Point B, int r) {
		double dis = Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
		return dis == r ? CirclePosition.ONSITE : dis < r ? CirclePosition.INSITE : CirclePosition.OUTSITE;
	}
}
