package Bean;

import java.util.Objects;

public class Trader {
    private String name ;
    private String city ;

    public Trader(){
        System.out.println("default constructor");
    }

    public Trader(String name, String city){
        this.name = name ;
        this.city = city ;
    }

    public String getName(){
        return this.name ;
    }

    public String getCity(){
        return this.city ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setCity(String city){
        this.city = city ;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + this.name + '\'' +
                ", city='" + this.city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(name, trader.name) &&
                Objects.equals(city, trader.city);

//        if(this == o ) return true ;
//        if(!(o instanceof  Trader)) return false ;
//        Trader that = (Trader) o ;
//        return this.getName().equals(that.getName()) && this.getCity().equals(that.getCity());

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}