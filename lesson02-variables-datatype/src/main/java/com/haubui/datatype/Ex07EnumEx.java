package com.haubui.datatype;

import com.haubui.common.Point;
import com.haubui.common.Position;

public class Ex07EnumEx {
	public static void main(String[] args) {

		Point A = new Point(3, 4);
		Point O = new Point(0, 0);
		int r = 5;

		Position pos = getPointStatusWithCircle(A, O, r);
		System.out.println(pos.value);

	}

	public static Position getPointStatusWithCircle(Point A, Point O, int r) {

		double d = getDistance(A, O);

		return d > r ? Position.OUTSIDE : d < r ? Position.INSIDE : Position.ONSIDE;
	}

	private static double getDistance(Point A, Point O) {
		return Math.sqrt(Math.pow(A.getX() - O.getX(), 2) + Math.pow(A.getY() - O.getY(), 2));
	}
}
