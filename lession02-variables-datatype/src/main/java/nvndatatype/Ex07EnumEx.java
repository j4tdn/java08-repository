package nvndatatype;

import java.util.Scanner;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {

	public static void main(String[] args) {
		Point A = new Point(3, 4);
		Point O = new Point(0, 0);
		
		CirclePosition pos = ketQua(A,O,5);

		System.out.println("Result: " + pos.value);

	}

	public static CirclePosition ketQua(Point A,Point O, int R) {
		double distance = Math.sqrt((A.x - O.x) * (A.x - O.x) + (A.y - O.y) * (A.y - O.y));
		return distance == R ? CirclePosition.ONSIDE : distance > R ? CirclePosition.OUTSIDE : CirclePosition.INSIDE;

		/*
		 * if ((xA - xO) * (xA - xO) + (yA - yO) * (yA - yO) > 5 * 5) { return
		 * CirclePosition.OUTSIDE; } else if ((xA - xO) * (xA - xO) + (yA - yO) * (yA -
		 * yO) == 5 * 5) { return CirclePosition.ONSIDE; } else { return
		 * CirclePosition.INSIDE; }
		 */

	}

}
