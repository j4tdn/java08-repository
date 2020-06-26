package immutable;

public class StringCount {
	private int numberOfLower;
	private int numberOfUpper;
	private int numberOfDitgit;
	
	public StringCount() {
		// TODO Auto-generated constructor stub
	}

	public StringCount(int numberOfLower, int numberOfUpper, int numberOfDitgit) {
		super();
		this.numberOfLower = numberOfLower;
		this.numberOfUpper = numberOfUpper;
		this.numberOfDitgit = numberOfDitgit;
	}

	public int getLetters() {
		return numberOfLower;
	}

	public void setLetters(int letters) {
		this.numberOfLower = letters;
	}

	public int getCapitalLetters() {
		return numberOfUpper;
	}

	public void setCapitalLetters(int capitalLetters) {
		this.numberOfUpper = capitalLetters;
	}

	public int getNumbers() {
		return numberOfDitgit;
	}

	public void setNumbers(int numbers) {
		this.numberOfDitgit = numbers;
	}
	
	@Override
	public String toString() {
		return "Lowercase: " + numberOfLower + "\nUpperCase: " + numberOfUpper + "\nDigits: " + numberOfDitgit;
	}
	
	
}
