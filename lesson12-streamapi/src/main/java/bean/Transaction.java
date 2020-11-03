package bean;

import java.util.Objects;

public class Transaction {
	private Integer id;
	private Trader trader;
	private int year;
	private int value;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(Integer id, Trader trader, int year, int value) {
		super();
		this.id = id;
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
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
	public int hashCode() {
		return Objects.hash(id, trader, year, value);
	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Transaction)){
			return false;
		}
		
		Transaction that = (Transaction)obj;
		return  getId() == that.getId()
				&& getYear() == that.getYear()
				&& getValue() == that.getValue()
				&& getYear() == that.getYear();
	}
	
}
