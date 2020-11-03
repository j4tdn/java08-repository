package bean;

public class Transaction {
	
	private Trander trander;
	private int year;
	private int value;
	
	public Transaction() {

	}

	public Transaction(Trander trander, int year, int value) {
		this.trander = trander;
		this.year = year;
		this.value = value;
	}

	public Trander getTrander() {
		return trander;
	}

	public void setTrander(Trander trander) {
		this.trander = trander;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		
		return 	"Transaction: "
				+ " Name:" + trander.getName()
				+ " Year:" + year 
				+ " Value:" + value
				+ " City:" + trander.getCity()
				+"\n";
			
	}
	
	

}
