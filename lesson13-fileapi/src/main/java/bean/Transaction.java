package bean;

public class Transaction {
	@Override
	public String toString() {
		return "Transaction [name=" + name + ", year=" + year + ", value=" + value + "]";
	}

	private Trader name;
	private int year;
	private int value;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param year
	 * @param value
	 */
	public Transaction(Trader name, int year, int value) {
		super();
		this.name = name;
		this.year = year;
		this.value = value;
	}

	public Trader getName() {
		return name;
	}

	public void setName(Trader name) {
		this.name = name;
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
	
	
	

}

