package bean;

import java.time.LocalDate;

import view.ShopDemo;

public class Bill {
	private String id;
	private Customer customer;
	private Item[] items;
	private LocalDate date;
	public Bill() {
		
	}
	public Bill(String id, Customer customer, Item[] items, LocalDate date) {
		super();
		this.id = id;
		this.customer = customer;
		this.items = items;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
			double totalOfMoney = 0;
			Item[] items = this.getItems();
			LocalDate date = this.getDate();
			for (Item item : items) {
				double price = item.getPrice();
				if(date.isEqual(ShopDemo.DISCOUNT_DATE) && price > ShopDemo.DISCOUNT_PRICE)
					totalOfMoney += price*ShopDemo.SALE_RATE_PRICE;
				else {
					totalOfMoney += price;
				}
			}
			return totalOfMoney;
		}
	
}
