package bean;

import java.time.LocalDate;
import java.time.Month;

public class Bill {
	private static final LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 5);
	private static final double DISCOUNT_PRICE = 590;
	private static final double SALE_RATE_PRICE = 0.9;
	
	private String id;
	private Customer customer;
	private Item[] items;
	private LocalDate date;
	private double totalOfMoney;
	
	public Bill() {
	}

	public Bill(String id, Customer customer, Item[] items, LocalDate date) {
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
		double money = 0;
		Item[] items = this.getItems();
		LocalDate date = this.getDate();
		for (int i = 0; i < items.length; i++) {
			double price = items[i].getPrice();
			if (date.isEqual(DISCOUNT_DATE) && price > DISCOUNT_PRICE) {
				money += price * SALE_RATE_PRICE;
			} else {
				money += price;
			}
		}
		return money;
	}	
}
