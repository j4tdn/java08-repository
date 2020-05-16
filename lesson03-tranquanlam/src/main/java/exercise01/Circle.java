package exercise01;

public class Circle {
	private Point tam;
	private double r;
	
	public Circle(Point tam, double r) {
		super();
		this.tam = tam;
		this.r = r;
	}
	public Point getTam() {
		return tam;
	}
	public void setTam(Point tam) {
		this.tam = tam;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public boolean checkOnCircle(Point point) {
		return this.tam.getDistance(point) == 0 ? true : false;
	}
	
	@Override
	public String toString() {
		
		return "O("+ this.tam.getX() +";"+ this.tam.getY()+")," + "r = " +this.r;
	}

}
