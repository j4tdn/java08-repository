package immuatable;

public class StringCounter {
	private int upperChars;
	private int lowerChars;
	private int digits;

	public StringCounter() {
	}

	public StringCounter(int upperChars, int lowerChars, int digits) {
		super();
		this.upperChars = upperChars;
		this.lowerChars = lowerChars;
		this.digits = digits;
	}

	public int getUpperChars() {
		return upperChars;
	}

	public void setUpperChars(int upperChars) {
		this.upperChars = upperChars;
	}

	public int getLowerChars() {
		return lowerChars;
	}

	public void setLowerChars(int lowerChars) {
		this.lowerChars = lowerChars;
	}

	public int getDigits() {
		return digits;
	}

	public void setDigits(int digits) {
		this.digits = digits;
	}

	@Override
	public String toString() {
		return "upperChars = " + upperChars + "\nlowerChars = " + lowerChars + "\ndigits = " + digits;
	}

}
