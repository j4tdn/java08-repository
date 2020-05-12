package phd.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07_Enum_Ex {

	public static void main(String[] args) {
		// A(x,y)
		// R : 5;
		// Kieemr tra vị trí tương đối của A :
		//

		/*
		 * System.out.println(kiemtraA(5,4)); int xA = 4; int yA = 3; int R = 5; int
		 * xO=0 ; int yO=0;
		 */
		Point A = new Point(3,4);
		Point O = new Point(0,0);
		int R = 5;
		CirclePosition pos = getPointStatusWithCricle(A,O,R);
		System.out.println(pos);
	}

	/*
	 * public static String kiemtraA(int x, int y) { String trong = "Trong "; String
	 * ngoai = "ngoai"; String tren = "trên"; String temp = "temp"; double OA =
	 * (double) Math.sqrt(x*x +y*y); if(OA==5) { return tren; } else if(OA>5) {
	 * return ngoai; } else if(OA<5) { return ngoai; } return temp ;
	 * 
	 * }
	 */
	public static CirclePosition getPointStatusWithCricle(Point A, Point O,int R) {
		double Distance = Math.sqrt(Math.pow(A.x-O.x,2)+Math.pow(A.y-O.y,2));
		/*
		 * if(Distance==R) { return CirclePosition.ONSIDE ; } if(Distance <R) { return
		 * CirclePosition.INSIDE; } return CirclePosition.OUTSIDE ;
		 */

		return Distance == R ? CirclePosition.ONSIDE : Distance < R ? CirclePosition.INSIDE : CirclePosition.OUTSIDE;
	}
}
