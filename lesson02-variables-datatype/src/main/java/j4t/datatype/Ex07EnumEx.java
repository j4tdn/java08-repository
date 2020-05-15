package j4t.datatype;

import j4t.common.CirclePosition;
import j4t.common.Point;

public class Ex07EnumEx {
	public static void main(String[] args) {
		/*
		 * A(xa, ya) R: 5 kiem tra vi tri tuong doi cua A so voi
		 */
		Point A = new Point(3, 4);
		Point O = new Point(0, 0);
		CirclePosition pos=local(A, O, 5);
		System.out.println("Result\t"+pos.value);
	}

	public static CirclePosition local(Point A, Point O, int R) {
		double distance = Math.sqrt(Math.pow((A.x-O.x),2) + Math.pow((A.y-O.y),2));
		/*
		 * if (distance == R) { return CirclePosition.ONSIDE; } else if (distance < R) {
		 * return CirclePosition.INSIDE; }
		 */
			return distance==R? CirclePosition.ONSIDE: distance<R?CirclePosition.INSIDE : CirclePosition.OUTSIDE;
	}
}