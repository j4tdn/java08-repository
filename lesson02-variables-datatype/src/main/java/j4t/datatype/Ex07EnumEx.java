package j4t.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {

	public static void main(String[] args) {
		Point A = new Point(3, 4);
		Point O = new Point(0, 0);

		int R = 5;
		CirclePosition pos = Ktra(A, O, R);
		System.out.println("Result:" + pos.value);
	}

	public static CirclePosition Ktra(Point A, Point O, int r) {
		double distance = Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));
		return distance == r ? CirclePosition.ONSIDE : distance < r ? CirclePosition.INSIDE : CirclePosition.OUTSIDE;

	}

}
