package Bean;

import java.util.Objects;

public class Transaction {
    private Trader trader ;
    private int year ;
    private int value ;
    private int id ;

    public Transaction(){
        System.out.println("default constructor");

    }

    public Transaction(int id ,Trader trader , int year, int value){
        this.id = id ;
        this.trader = trader;
        this.year = year ;
        this.value  = value ;

    }

    public int getId(){
        return this.id ;
    }
    public void setId(int id){
        this.id = id ;
    }

    public Trader getTrader(){
        return this.trader;
    }

    public int getYear(){
        return this.year ;
    }
    public int getValue(){
        return this.value ;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setYear(int year){
        this.year = year ;
    }

    public void setValue(int year){
        this.year = year ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return year == that.year &&
                value == that.value &&
                id == that.id &&
                Objects.equals(trader, that.trader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trader, year, value, id);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                ", id=" + id +
                '}';
    }
}