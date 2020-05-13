package cuong.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {

	public static void main(String[] args) {
		Point A = new Point(1, 1);
		Point O = new Point(0, 0);
		int R = 1;

		CirclePosition pos = checkPointPosition(A, O, R);
		System.out.println("A" + A + " " + pos.value);
	}

	public static CirclePosition checkPointPosition(Point A, Point O, int R) {
		double distance = Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
		return (distance == R) ? CirclePosition.ONSIDE
				: (distance < R) ? CirclePosition.INSIDE : CirclePosition.OUTSIDE;
	}
}
