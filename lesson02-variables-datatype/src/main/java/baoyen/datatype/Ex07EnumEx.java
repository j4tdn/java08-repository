package baoyen.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {
	public static void main(String[] args) {
		Point a=new Point(3, 4);
		Point o=new Point(0, 0);
		int r=5;
		CirclePosition pos=kt(a,o,r);
		System.out.println("result :"+pos.value);
		
	}
	private static CirclePosition kt(Point a,Point o,int r) {
		double distance=Math.sqrt(Math.pow(a.x - o.x, 2)+Math.pow(a.y - o.y, 2));
		return distance==r?CirclePosition.ONSITE:distance<r?CirclePosition.INSIDE:CirclePosition.OUTSIDE;
	}
}
