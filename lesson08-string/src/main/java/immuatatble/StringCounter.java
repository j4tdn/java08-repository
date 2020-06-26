package immuatatble;

public class StringCounter {
	private int NumberOfLowerChars;
	private int NumberOfUpperChars;
	private int NumberOfDigital;

	public StringCounter() {
		// TODO Auto-generated constructor stub
	}

	public StringCounter(int numberOfLowerChars, int numberOfUpperChars, int numberOfDigital) {
		super();
		NumberOfLowerChars = numberOfLowerChars;
		NumberOfUpperChars = numberOfUpperChars;
		NumberOfDigital = numberOfDigital;
	}

	public int getNumberOfLowerChars() {
		return NumberOfLowerChars;
	}

	public void setNumberOfLowerChars(int numberOfLowerChars) {
		NumberOfLowerChars = numberOfLowerChars;
	}

	public int getNumberOfUpperChars() {
		return NumberOfUpperChars;
	}

	public void setNumberOfUpperChars(int numberOfUpperChars) {
		NumberOfUpperChars = numberOfUpperChars;
	}

	public int getNumberOfDigital() {
		return NumberOfDigital;
	}

	public void setNumberOfDigital(int numberOfDigital) {
		NumberOfDigital = numberOfDigital;
	}

}
