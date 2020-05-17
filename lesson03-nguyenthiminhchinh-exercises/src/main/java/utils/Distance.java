package utils;

import bean.Point;

public class Distance {
	private Distance() {

	}

	public static double CalDist(Point o, Point a) {
		double d = Math.sqrt(Math.pow(a.getX() - o.getX(), 2) + Math.pow(a.getY() - o.getY(), 2));
		return d;
	}

	public static void check(Point o, Point a, float r) {
		if (CalDist(o, a) == r)
			System.out.println("A nằm trên đường tròn");
		else if (CalDist(o, a) < r)
			System.out.println("A nằm trong đường tròn");
		else
			System.out.println("A nằm ngoài đường tròn");
	}
}
