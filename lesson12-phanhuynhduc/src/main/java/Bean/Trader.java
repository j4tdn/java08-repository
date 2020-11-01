package Bean;

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
}
