package Builder;

public class CarBuilder {

    private int id ;
    private String name ;
    private int price ;

    private boolean isOld ;



    private CarBuilder(){
       // System.out.println("no permission to call it outside of class");
    }

    static CarBuilder getCarBuilder(){
        return new CarBuilder();
    }

    public CarBuilder addId(int id){
        this.id = id ;
        return this ;
    }

    public CarBuilder addName(String name){
        this.name = name ;
        return this ;
    }

    public CarBuilder addPrice(int price){
        this.price = price ;
        return this ;
    }

    public CarBuilder addIsOld(boolean isOld){
        this.isOld = isOld;
        return this ;
    }


    public Car build(){
        return new Car(this.id,this.name,this.price,this.isOld);
    }



}
