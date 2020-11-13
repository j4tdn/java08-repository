package bean;

import java.util.Objects;

public class Transaction {
	private int id;
	private Trader trader;
	private int year;
	private int value;

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

	public Transaction(int id, Trader trader, int year, int value) {
		super();
		this.id = id;
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Transaction() {

	}
	public Transaction(String line) {
		String[] elements=line.split(" , ");
		if(elements.length==4) {
			this.id=Integer.parseInt(elements[0]);
			String traderattribute=elements[1];
			String name = traderattribute.substring(1,traderattribute.lastIndexOf(","));
			String city = traderattribute.substring(traderattribute.lastIndexOf(",")+1,traderattribute.length()-1);
			this.trader = new Trader(name,city);
			this.year=Integer.parseInt(elements[2]);
			this.value=Integer.parseInt(elements[3]);
			String traderAttribute = elements[1];
			
			
		
		}

	}
	@Override
	public int hashCode() {

		return Objects.hash(id, trader, year, value);
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
	public String toString() {
		return id +", " +"("+ trader.getCity()+" , "+trader.getCity()+")"+ " , "+ year +", " + value ;
	}
}
