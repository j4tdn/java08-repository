package Bai01;

import java.util.Scanner;

public class Point {

	private float x;
	private float y;
	
	public Point() {
		
	}

	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
		
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point x=" + x + ", y=" + y + "";
	}
	
	
}
