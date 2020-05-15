package bean;

public class HinhTron {
	private Point o = new Point();
	private Double r;
	
	public HinhTron() {

	}

	public HinhTron(Point o, Double r) {
		this.o = o;
		this.r = r;
	}

	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}
	
}
