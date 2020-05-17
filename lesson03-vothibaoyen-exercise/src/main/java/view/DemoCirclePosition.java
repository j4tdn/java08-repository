package view;
import java.util.Scanner;

import bean.Point;
import utils.CirclePosition;
public class DemoCirclePosition {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		System.out.print("Nhập toa do x cua diem a : ");
		x=sc.nextInt();
		System.out.print("Nhập toa do y cua diem a : ");
		y=sc.nextInt();
		Point a=new Point(x, y);
		Point o=new Point(0, 0);
		System.out.print("Nhập r: ");
		int r=sc.nextInt();
		CirclePosition pos=kt(a,o,r);
		System.out.println("result :"+pos.value);

	}
	private static CirclePosition kt(Point a,Point o,int r) {
		double distance=Math.sqrt(Math.pow(a.getX() - o.getX(), 2)+Math.pow(a.getY() - o.getY(), 2));
		return distance==r?CirclePosition.ONSITE:distance<r?CirclePosition.INSIDE:CirclePosition.OUTSIDE;
	}
}
