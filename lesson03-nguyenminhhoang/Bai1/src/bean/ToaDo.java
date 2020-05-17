package bean;

public class ToaDo {
	private int x;
	private int y;

	public ToaDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToaDo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "ToaDo [x=" + x + ", y=" + y + "]";
	}

}
