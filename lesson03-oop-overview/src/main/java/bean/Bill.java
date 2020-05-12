package bean;

import java.time.LocalDateTime;
import java.util.List;

import view.ShopDemo;

public class Bill {
	private String id;
	private Customer customer;
	private Item[] items;
	private LocalDateTime dateTime;

	public Bill() {
		// TODO Auto-generated constructor stub
	}

	public Bill(String id, Customer customer, Item[] items, LocalDateTime dateTime) {
		super();
		this.id = id;
		this.customer = customer;
		this.items = items;
		this.dateTime = dateTime;
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

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public double getTotalOfMoney() {
		double money = 0;

		for (Item item : this.items) {
			if (this.getDateTime().isEqual(ShopDemo.DISCOUNT_DATE) && item.getPrice() > ShopDemo.DISCOUNT_PRICE) {
				money += item.getPrice() * ShopDemo.DISCOUNT_RATE;
			} else {
				money += item.getPrice();
			}
		}

		return money;
	}


}
