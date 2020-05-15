package view;

import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;

import bean.Customer;
import bean.Item;
import bean.bill;
import utils.BillUtils;

public class ShopDemo {
	public final static LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 05);

	public static void main(String[] args) {
		Item nokia = new Item("nokia", "TBD", 100, "gray");
		Item samsung = new Item("samsung", "android", 500, "black");
		Item iphone6 = new Item("iphone6", "ios", 600, "white");
		Item iphone7 = new Item("iphone7", "ios", 800, "pink");

		Customer andy = new Customer("01", "Andy", "12345", "quan 1");
		Customer join = new Customer("01", "Join", "12345", "quan 1");

		Item[] firstItem = { nokia, samsung, iphone6 };
		Item[] secondItem = { nokia, iphone7, iphone6 };

		bill firstBill = new bill("01", andy, firstItem, LocalDate.of(2020, Month.MAY, 05));
		firstBill.getTotalOfMoney();
		// BillUtils.expor(firstBill);
		bill secondBill = new bill("02", join, secondItem, LocalDate.of(2020, Month.MAY, 05));
		secondBill.getTotalOfMoney();
		// BillUtils.expor(secondBill);
		BillUtils.expor(firstBill, secondBill);
	}

}
