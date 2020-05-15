package bean;

import java.time.LocalDate;

import view.ShopDemo;

public class Bill {

	private String Id;
	private Customer customer;
	private Item[] items;
	private LocalDate date;
	
	
	
	public Bill() {
		
	}
	public Bill(String id, Customer customer, Item[] items, LocalDate date) {
		
		Id = id;
		this.customer = customer;
		this.items = items;
		this.date = date;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getTotalOfMoney() {
		double totalOfMoney=0;
		 Item[] items= this.getItems();
		 LocalDate date=this.getDate();
		 for(int i=0;i<items.length;i++) {		
			 double price=items[i].getPrice();
			 
			 if(date.isEqual(ShopDemo.DISCOUNT_DATE)&& price>=ShopDemo.DISCOUNT_PRICE)
				 totalOfMoney +=price*ShopDemo.SALE_DATE_PRICE;
			 else
				 totalOfMoney+=price;
		 }
		 
		
		return totalOfMoney;
	}
	
	
	
	
	
}
