package thuy.datatype;

import common.CirclePosition;
import common.Point;

public class Ex07EnumEx {

	public static void main(String[] args) {
	
		//A
		
		
		
		Point A = new Point(3, 4);
		Point O = new Point(0, 0);
		
		int R = 5;
		CirclePosition pos = kiemTra(A, O,  R);
		System.out.println("Result: " + pos.value);
		//A(xA, yA), R:bk 5, kiem tra vi tri tuong doi cua A so voi duong tron(tren, trong, ngoai duong tron)
	}
	
	public static CirclePosition kiemTra(Point A, Point O, int R) {
		
		double distance = Math.sqrt(Math.pow(A.x - A.y, 2) - Math.pow(A.y - O.y, 2));
		
		
		return distance == R ? CirclePosition.ONSIDE
				: distance < R ? CirclePosition.INSIDE
						: CirclePosition.OUTSIDE;

	}

}
