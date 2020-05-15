package java08.ex02;

public class Vehicle {
    private String vehicleOwnerName;
    private String kindOfVehicle;
    private int capacity;
    private double valueOfVehivle;
    private double taxMoney;

    public Vehicle() {
    }

    public Vehicle(String vehicleOwnerName, String kindOfVehicle, int capacity, double valueOfVehivle) {
        this.vehicleOwnerName = vehicleOwnerName;
        this.kindOfVehicle = kindOfVehicle;
        this.capacity = capacity;
        this.valueOfVehivle = valueOfVehivle;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public String getKindOfVehicle() {
        return kindOfVehicle;
    }

    public void setKindOfVehicle(String kindOfVehicle) {
        this.kindOfVehicle = kindOfVehicle;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getValueOfVehivle() {
        return valueOfVehivle;
    }

    public void setValueOfVehivle(double valueOfVehivle) {
        this.valueOfVehivle = valueOfVehivle;
    }

    public double getTaxMoney() {
        if(this.getCapacity() < 100){
            taxMoney = this.getValueOfVehivle()* 0.01;
        }else if(this.getCapacity() >= 100 && this.getCapacity() <= 200){
           taxMoney = this.getValueOfVehivle()*0.03;
        }else{
            taxMoney = this.getValueOfVehivle()*0.05;
        }
        return taxMoney;
    }

    public void setTaxMoney(double taxMoney) {
        this.taxMoney = taxMoney;
    }
}
