package mchinhng.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {

	public static void main(String[] args) {
		// A(xA, yA)
		// R: 5
		// Kiem tra vi tri tuong doi cua A so voi duong tron
		// String: Trong, tren,

		Point A = new Point(3, 4);
		Point O = new Point(0, 0);

		int R = 5;
		// System.out.println(ktra(xA, yA, xO, yO, R));

		CirclePosition pos = ktra(A, O, R);
		System.out.println("Result: " + pos.value);

	}

	private static CirclePosition ktra(Point A, Point O, int R) {
		double d = Math.sqrt(Math.pow(A.x - O.x, 2) - Math.pow(A.y - O.y, 2));
		/*
		 * if (d == R) { return CirclePosition.ONSIDE; } if (d < R) { return
		 * CirclePosition.INSIDE; } return CirclePosition.OUTSIDE;
		 */
		return d == R ? CirclePosition.ONSIDE 
				: d < R ? CirclePosition.INSIDE 
						: CirclePosition.ONSIDE;
	}

}
