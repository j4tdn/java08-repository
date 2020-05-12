package com.haubui.lesson03_oop_overview.bean;

import java.time.LocalDate;
import java.util.Arrays;

import com.haubui.lesson03_oop_overview.view.ShopDemo;

public class Bill {
	private String id;
	private Customer customer;
	private Item[] items;
	private LocalDate date;
	private double priceTotal;

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

	public double getPriceTotal() {

		LocalDate date = this.getDate();
		for (Item items : this.getItems()) {
			double price = items.getPrice();
			if (ShopDemo.isSaleDate(date) && ShopDemo.isSaleItem(price)) {
				priceTotal += items.getPrice() * ShopDemo.SALE_RACE_PRICE;
			} else {
				priceTotal += items.getPrice();
			}
		}

		return priceTotal;
	}

	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", customer=" + customer.getFullName() + ", items=" + Arrays.toString(items)
				+ ", date=" + date + ", priceTotal=" + priceTotal + "]";
	}

}
