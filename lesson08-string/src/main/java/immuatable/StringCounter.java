package immuatable;

public class StringCounter {
	private int numberoflowerchar;
	private int numberofuperchar;
	private int numberofdigital;
	
	public StringCounter(int numberoflowerchar, int numberofuperchar, int numberofdigital) {
		super();
		this.numberoflowerchar = numberoflowerchar;
		this.numberofuperchar = numberofuperchar;
		this.numberofdigital = numberofdigital;
	}

	public int getNumberoflowerchar() {
		return numberoflowerchar;
	}

	public void setNumberoflowerchar(int numberoflowerchar) {
		this.numberoflowerchar = numberoflowerchar;
	}

	public int getNumberofuperchar() {
		return numberofuperchar;
	}

	public void setNumberofuperchar(int numberofuperchar) {
		this.numberofuperchar = numberofuperchar;
	}

	public int getNumberofdigital() {
		return numberofdigital;
	}

	public void setNumberofdigital(int numberofdigital) {
		this.numberofdigital = numberofdigital;
	}
	
}
