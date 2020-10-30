package Builder;

public class Car {

    private int id ;

    private String name ;

    private int price ;

    private boolean isOld ;


    public Car(int id, String name, int price, boolean isOld) {
        this.id = id ;
        this.name = name;
        this.price = price ;
        this.isOld = isOld ;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isOld=" + isOld +
                '}';
    }

    public static void main(String[] args) {
       Car myCar  =  CarBuilder.getCarBuilder().addId(5).addPrice(6).build();

       // nhuwng thuoc tinh khong duoc add thi se thanh null ( voi kieu du lieu doi tuong ) hoac default value doi voi kieu du lieu nguyen thuy

        System.out.println(myCar.toString());
    }

}
