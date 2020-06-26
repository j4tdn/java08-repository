package immuatable;

public class StringCounter {
	private int numberOflowerChars;
	private int numberOfUpperChars;
	private int numberOfdigital;
	
	
	public int getNumberOflowerChars() {
		return numberOflowerChars;
	}
	public void setNumberOflowerChars(int numberOflowerChars) {
		this.numberOflowerChars = numberOflowerChars;
	}
	public int getNumberOfUpperChars() {
		return numberOfUpperChars;
	}
	public void setNumberOfUpperChars(int numberOfUpperChars) {
		this.numberOfUpperChars = numberOfUpperChars;
	}
	public int getNumberOfdigital() {
		return numberOfdigital;
	}
	public void setNumberOfdigital(int numberOfdigital) {
		this.numberOfdigital = numberOfdigital;
	}
	@Override
	public String toString() {
		return "numberOflowerChars:" + numberOflowerChars + "\nnumberOfUpperChars:" + numberOfUpperChars
				+ "\nnumberOfdigital:" + numberOfdigital;
	}
	
	

}
