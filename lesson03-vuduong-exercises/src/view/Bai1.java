package view;

import bean.Point;

public class Bai1 {
	public static void main(String[] args) {
		Point tam = new Point(5,6);
		Point pointA = new Point(7, 0);
		
		System.out.println(pointBelongsToCircle(tam, 100.0, pointA));
		
	}

	private static boolean pointBelongsToCircle(Point tam, double R, Point point) {
		double distance = Math.sqrt((tam.getX() + point.getX()) * (tam.getX() + point.getX())
				+ (tam.getY() + point.getY()) * (tam.getY() + point.getY()));
		return distance > R ? false : true;
	}

}
