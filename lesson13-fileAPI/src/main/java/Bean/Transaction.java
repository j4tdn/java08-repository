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

    public Transaction(String s) {

        String[] elements = s.split(" - ");
        if(elements.length ==4){
            this.id = Integer.parseInt(elements[0]);
            String traderAttributes = elements[1];
            String name = traderAttributes.substring(1,traderAttributes.lastIndexOf(","));
            String city = traderAttributes.substring(traderAttributes.lastIndexOf(", ")+1,traderAttributes.length()-1);

            this.trader = new Trader(name,city);
            this.year = Integer.parseInt(elements[2]);
            this.value = Integer.parseInt(elements[3]);

        }




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