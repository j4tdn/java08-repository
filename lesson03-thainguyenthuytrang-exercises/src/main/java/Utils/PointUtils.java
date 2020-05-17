package Utils;

import bean.Point;

public class PointUtils {
	public static double distance(Point... points) {
		double dis = 0;
		int i = 0;
		dis = Math.pow((points[i + 1].getX() - points[i].getX()), 2)
				+ Math.pow((points[i + 1].getY() - points[i].getY()), 2);

		return dis;

	}

	public static void check(Double R, Point... points) {
		R *= R;
		if (distance(points) < R) {
			System.out.println("diem M nam trong duong tron");
		} else if (distance(points) == R) {
			System.out.println("diem M nam tren duong tron");
		} else {
			System.out.println("diem M nam ngoai duong tron");
		}

	}
}
