package immuatable;

public class StringCounter {

	private int NumberOfLowerChars;
	private int NumberOfDigit;
	private int NumberOfUperChars;

	public StringCounter() {
		
	}

	public StringCounter(int countLowers, int countUpers, int countDigits) {
		super();
		NumberOfLowerChars = countLowers;
		NumberOfDigit = countUpers;
		NumberOfUperChars = countDigits;
	}

	public int getNumberOfLowerChars() {
		return NumberOfLowerChars;
	}

	public void setNumberOfLowerChars(int numberOfLowerChars) {
		NumberOfLowerChars = numberOfLowerChars;
	}

	public int getNumberOfDigit() {
		return NumberOfDigit;
	}

	public void setNumberOfDigit(int numberOfDigit) {
		NumberOfDigit = numberOfDigit;
	}

	public int getNumberOfUperChars() {
		return NumberOfUperChars;
	}

	public void setNumberOfUperChars(int numberOfUperChars) {
		NumberOfUperChars = numberOfUperChars;
	}

	@Override
	public String toString() {
		return "StringCounter [NumberOfLowerChars=" + NumberOfLowerChars + ", NumberOfDigit=" + NumberOfDigit
				+ ", NumberOfUperChars=" + NumberOfUperChars + "]";
	}
	

}
