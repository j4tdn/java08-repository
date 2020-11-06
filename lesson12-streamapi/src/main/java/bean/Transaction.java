package bean;

import java.util.Objects;

public class Transaction {
	private int id;
	private Trader trader;
	private int year;
	private int value;

	public Transaction() {
	}

	public Transaction(int id, Trader trader, int year, int value) {
		this.id = id;
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Transaction))
			return false;
		Transaction that = (Transaction) o;
		return getId() == that.getId() && getYear() == that.getYear() && getValue() == that.getValue()
				&& getTrader().equals(that.getTrader());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, trader, year, value);
	}

	@Override
	public String toString() {
		return "Transaction{" + "id=" + id + ", trader=" + trader + ", year=" + year + ", value=" + value + '}';
	}
}
