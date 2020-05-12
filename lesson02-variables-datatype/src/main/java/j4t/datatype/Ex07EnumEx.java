package j4t.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {
	public static void main(String[] args) {
		// A
		Point A = new Point(3, 4);
		Point B = new Point(0,0);
		int R =5;

		System.out.println(getPointPositionWithCircle(A,B, R));
	}



	private static String getPointPositionWithCircle(Point A, Point B, int R) {
		double distance = Math.sqrt(Math.pow(A.x - B.x, 2));
		return distance == R ? CirclePosition.ONSIDE.getValue()
				: distance < R ? CirclePosition.INSIDE.getValue() : CirclePosition.OUTSIDE.getValue();
	}

}
