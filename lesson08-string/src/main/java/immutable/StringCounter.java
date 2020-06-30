package immutable;

public class StringCounter {
	private int numberOfUpperChars;
	private int numberOfLowerChars;
	private int numberOfDigits;
	
	public StringCounter() {
		
	}
	
	public StringCounter(int numberOfUpperChars, int numberOfLowerChars, int numberOfDigits) {
		this.numberOfUpperChars = numberOfUpperChars;
		this.numberOfLowerChars = numberOfLowerChars;
		this.numberOfDigits = numberOfDigits;
	}

	public int getNumberOfUpperChars() {
		return numberOfUpperChars;
	}

	public void setNumberOfUpperChars(int numberOfUpperChars) {
		this.numberOfUpperChars = numberOfUpperChars;
	}

	public int getNumberOfLowerChars() {
		return numberOfLowerChars;
	}

	public void setNumberOfLowerChars(int numberOfLowerChars) {
		this.numberOfLowerChars = numberOfLowerChars;
	}

	public int getNumberOfDigits() {
		return numberOfDigits;
	}

	public void setNumberOfDigits(int numberOfDigits) {
		this.numberOfDigits = numberOfDigits;
	}
	
	@Override
	public String toString() {
		return "numberOfLowerChars: " + numberOfLowerChars + " "
				+ "numberOfUpperChars: " + numberOfUpperChars + " "
				+ "numberOfDigits: " + numberOfDigits
				;
	}


}
