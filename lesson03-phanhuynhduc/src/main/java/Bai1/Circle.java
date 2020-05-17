package Bai1;

public class Circle {
	
	private Point point ;
	private double r ;
	
	public Circle() {
		
	}
	public Circle(Point point , double r) {
		this.point = point ;
		this.r = r;
	}
	public void check(Point p) {
		
		double R = Math.sqrt(Math.pow(this.point.getX()-p.getX(),2)+Math.pow(this.point.getY()-p.getY(),2));
		
		if(this.r == R) {
			System.out.println("Diem do thuoc duong tron");
			return ;
		}
		System.out.println("Diem do khong thuoc duong tron");
	}
	
}
