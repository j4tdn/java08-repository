package Bean;

public class Transaction {
    private Trader trader ;
    private int year ;
    private int value ;

    public Transaction(){
        System.out.println("default constructor");

    }

    public Transaction(Trader trader , int year, int value){
        this.trader = trader;
        this.year = year ;
        this.value  = value ;

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
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
