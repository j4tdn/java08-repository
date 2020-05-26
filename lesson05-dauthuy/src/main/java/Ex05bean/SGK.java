package Ex05bean;

public class SGK extends Book {
	private boolean state;

	public SGK() {

	}

	public SGK(String id, double price, String nXB, boolean state) {
		super(id, price, nXB);
		this.state = state;
	}


	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
}
