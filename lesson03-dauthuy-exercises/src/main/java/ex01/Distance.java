package ex01;

import ex01.Coor;

public class Distance {
	
	public static float distance(Coor O, Coor A, float R) {
		float distance;
		distance = (float) Math.sqrt(Math.pow((A.getX() - O.getX()), 2) + Math.pow(A.getY() - O.getY(), 2));
		return distance;
	}
}
