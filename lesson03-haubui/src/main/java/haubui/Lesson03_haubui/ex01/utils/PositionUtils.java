package haubui.Lesson03_haubui.ex01.utils;

import haubui.Lesson03_haubui.ex01.bean.Circle;
import haubui.Lesson03_haubui.ex01.bean.Point;
import haubui.Lesson03_haubui.ex01.common.Position;

public class PositionUtils {
	public static Position getPointStatusWithCircle(Circle circle, Point A) {

		double r = circle.getR();
		Point O = circle.getCentre();

		double d = getDistance(A, O);

		return d > r ? Position.OUTSIDE : d < r ? Position.INSIDE : Position.ONSIDE;
	}

	private static double getDistance(Point A, Point O) {
		return Math.sqrt(Math.pow(A.getX() - O.getX(), 2) + Math.pow(A.getY() - O.getY(), 2));
	}

	
}
