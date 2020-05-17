package phuoctam.com.lesson03_nguyenphuoctam.exe02;

public class Carriage extends Customer{
	private String model;
	private int price;
	private int capacity;
	private int tax;
	public Carriage(String model, int price, int capacity) {
		super();
		this.model = model;
		this.price = price;
		this.capacity = capacity;
		
	}
	public Carriage() {
		super();
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getTax() {
		if(this.capacity<100){
			return this.price*1/100;
		}else if(this.capacity<=200){
			return this.price*3/100;
		}
		return this.price*5/100;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Customer Name = "+getName()+"   Carriage [model=" + model + ", price=" + price + ", capacity=" + capacity + ", tax=" + tax + "]";
	}
	
	
	
}
