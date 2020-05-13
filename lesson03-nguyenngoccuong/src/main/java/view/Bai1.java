package view;

import bean.Point;

public class Bai1 {
	public static void main(String[] args) {
		Point A = new Point(1, 1);
		Point O = new Point(0, 0);
		int R = 1;

		boolean pos = checkPointPosition(A, O, R);
		System.out.println(pos);
	}

	public static boolean checkPointPosition(Point A, Point O, int R) {
		double distance = Math.sqrt(Math.pow(A.getX() - O.getX(), 2) + Math.pow(A.getY() - O.getY(), 2));
		return (distance == R) ? true : false;
	}
}
