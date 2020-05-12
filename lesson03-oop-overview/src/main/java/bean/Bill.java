package bean;

import java.time.LocalDate;

import bean.Customer;
import bean.Item;
import view.ShopDemo;

public class Bill {

	private Customer customer;

	private Item[] items;

	private String Id;

	private LocalDate date;

	private double totalOfMoney;

	public Bill() {

	}

	public Bill(Customer customer, Item[] items, String id, LocalDate date) {
		super();
		this.customer = customer;
		this.items = items;
		Id = id;
		this.date = date;
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

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getTotalOfMoney() {

		double money = 0;
		LocalDate date = this.getDate();
		System.out.println(date);
		Item[] items = this.getItems();

		for (int i = 0; i < items.length; i++) {
			double price = items[i].getPrice();
			if (date.isEqual(ShopDemo.DISCOUNT_DATE) && price > 590) {
				money += price * 0.9;
			} else {
				money += items[i].getPrice();
			}
		}
		return money;

	}

	public void setTotalOfMoney(double total) {

		this.totalOfMoney = total;

	}

}
