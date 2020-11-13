package bean;

import java.util.Objects;

public class Transaction {
	private int id;
	private Trader trader;
	private int year;
	private int value;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(int id, Trader trader, int year, int value) {
		super();
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

	public Transaction(String stringline) {
		String[] element = stringline.split(" - ");

		if (element.length == 4) {
			this.id = Integer.parseInt(element[0]);
			String traderAttribute = element[1];
			String name = traderAttribute.substring(1, traderAttribute.lastIndexOf(","));
			String city = traderAttribute.substring(traderAttribute.lastIndexOf(","));
			Trader trader = new Trader(name, city);

			this.trader = trader;
			this.year = Integer.parseInt(element[2]);
			this.value = Integer.parseInt(element[3]);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, trader, year, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (id != other.id)
			return false;
		if (trader == null) {
			if (other.trader != null)
				return false;
		} else if (!trader.equals(other.trader))
			return false;
		if (value != other.value)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}
