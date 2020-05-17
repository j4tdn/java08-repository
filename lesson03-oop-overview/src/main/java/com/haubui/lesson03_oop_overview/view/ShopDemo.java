package com.haubui.lesson03_oop_overview.view;

import java.time.LocalDate;
import java.time.Month;

import com.haubui.lesson03_oop_overview.bean.Bill;
import com.haubui.lesson03_oop_overview.bean.Customer;
import com.haubui.lesson03_oop_overview.bean.Item;
import com.haubui.lesson03_oop_overview.bean.ItemAdvance;
import com.haubui.lesson03_oop_overview.bean.ItemAdvance.Builder;
import com.haubui.lesson03_oop_overview.utils.BillUtils;

public class ShopDemo {

	public static LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 5);
	public static double DISCOUNT_PRICE = 590;
	public static double SALE_RACE_PRICE = 0.9;

	public static void main(String[] args) {
		// create 4 items
		Item nokia1202 = new Item("nokia1202", "Symbian", "gray", 100);
		Item galaxyA10 = new Item("galaxyA10", "Android", "black", 720);
		Item lgG3 = new Item("lgG3", "Android", "yellow", 450);
		Item iphone6 = new Item("iphone6", "IOS", "pink", 500);

		Builder builder = ItemAdvance.newInstance().id("1").name("aaaa").os("ios");
		
		//ItemAdvance item1 = builder.id("2").build(); id 1->2
		//System.out.println(item1.getId());
		
		ItemAdvance item1 = builder.price(150).build();
		

		
		
		// create 2 customers
		Customer john = new Customer("john", "0123456", "135", "USA");
		Customer david = new Customer("david", "0123456", "135", "PARIS");

		// create list items bought
		Item[] firstItems = { nokia1202, iphone6, galaxyA10 };
		Item[] secondItems = { lgG3, iphone6 };
		Item[] thirdItems = { nokia1202, galaxyA10 };

		// create bill
		Bill firstBill = new Bill("B01", john, firstItems, LocalDate.of(2020, Month.MAY, 5));
		Bill secondBill = new Bill("B02", david, secondItems, LocalDate.of(2020, Month.MARCH, 3));
		Bill thirdBill = new Bill("B03", john, thirdItems, LocalDate.of(2020, Month.OCTOBER, 10));

		BillUtils.export(firstBill, secondBill, thirdBill);

	}

	public static boolean isSaleItem(double price) {
		return price > DISCOUNT_PRICE;
	}

	public static boolean isSaleDate(LocalDate date) {
		return date.equals(DISCOUNT_DATE);
	}

}
