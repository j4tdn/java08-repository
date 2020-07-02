package immutable;

public class StringCounter {
	private int numberOfLowerChars;
	private int numberOfUpperChars;
	private int numberOfDigits;

	public StringCounter() {
	}

	public StringCounter(int numberOfLowerChars, int numberOfUpperChars, int numberOfDigits) {
		super();
		this.numberOfLowerChars = numberOfLowerChars;
		this.numberOfUpperChars = numberOfUpperChars;
		this.numberOfDigits = numberOfDigits;
	}

	public int getNumberOfLowerChars() {
		return numberOfLowerChars;
	}

	public void setNumberOfLowerChars(int numberOfLowerChars) {
		this.numberOfLowerChars = numberOfLowerChars;
	}

	public int getNumberOfUpperChars() {
		return numberOfUpperChars;
	}

	public void setNumberOfUpperChars(int numberOfUpperChars) {
		this.numberOfUpperChars = numberOfUpperChars;
	}

	public int getNumberOfDigits() {
		return numberOfDigits;
	}

	public void setNumberOfDigits(int numberOfDigits) {
		this.numberOfDigits = numberOfDigits;
	}

}