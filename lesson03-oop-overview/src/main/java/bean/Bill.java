package bean;

import java.time.LocalDate;

import view.ShopDemo;

public class Bill {
	private String id;
	private Customer customer; // 1 class cung la 1 kieu du lieu
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

	public double getTotalMoney() {
		double totalMoney = 0;

		Item[] items = this.getItems(); // this la doi tuong hien tai dang goi den ham nay
		LocalDate date = this.getDate();

		for (int i = 0; i < items.length; i++) {
			double price = items[i].getPrice();
			if (date.isEqual(ShopDemo.discount_date) && price > ShopDemo.discount_price)
				totalMoney += price * ShopDemo.sale_rate_price;
			else
				totalMoney += price;
		}
		return totalMoney;
	}

}
