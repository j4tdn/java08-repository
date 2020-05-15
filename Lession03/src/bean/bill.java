package bean;

import java.time.LocalDate;

import view.ShopDemo;

public class bill {
	private static final Object DISCOUNT_DATE = null;
	private String id;
	private Customer customer;
	private Item[] item;
	private LocalDate date;
	private double totalOfMoney;

	public bill() {
	}

	public bill(String id, Customer customer, Item[] item, LocalDate date) {
		super();
		this.id = id;
		this.customer = customer;
		this.item = item;
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

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getTotalOfMoney() {
		Item[] items = this.getItem();
		LocalDate date = this.getDate();
		for (int i = 0; i < items.length; i++) {
			if (date.equals(ShopDemo.DISCOUNT_DATE) && items[i].getPrice() > 590) {
				totalOfMoney += items[i].getPrice() * 0.9;
			} else {

				totalOfMoney = totalOfMoney + items[i].getPrice();
			}
		}
		return totalOfMoney;
	}

}
