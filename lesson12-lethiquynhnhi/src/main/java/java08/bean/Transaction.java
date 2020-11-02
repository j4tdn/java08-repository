package java08.bean;

import java.util.Objects;

public class Transaction {
    private Trader trader;
    private int year;
    private long value;

    public Transaction() {
    }

    public Transaction(Trader trader, int year, long value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
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

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
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
        return getYear() == that.getYear() &&
                getValue() == that.getYear() &&
                getTrader().equals(that.getTrader());
    }

    @Override
    public int hashCode() {
        return Objects.hash(trader, year, value);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
