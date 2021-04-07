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

	/**
	 * Convert from each line in data.txt file
	 * 
	 * @param stringLine string line
	 */
	public Transaction(String stringLine) {
		String[] elements = stringLine.split(" - ");
		if (elements.length == 4) {
			this.id = Integer.parseInt(elements[0]);
			String traderAttributes = elements[1];
			String name = traderAttributes.substring(1, traderAttributes.lastIndexOf(","));
			String city = traderAttributes.substring(traderAttributes.lastIndexOf(", "), traderAttributes.length() - 1);
			this.trader = new Trader(name, city);
			this.year = Integer.parseInt(elements[2]);
			this.value = Integer.parseInt(elements[3]);
		}
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Transaction)) {
			return false;
		}

		Transaction that = (Transaction) obj;
		return getId() == that.getId() && getYear() == that.getYear() && getValue() == that.getValue()
				&& getTrader().equals(that.getTrader());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, trader, year, value);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}
