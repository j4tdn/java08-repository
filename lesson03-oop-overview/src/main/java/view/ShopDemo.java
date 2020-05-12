package view;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import bean.Bill;
import bean.Customer;
import bean.Item;
import bean.ItemAdv;
import utils.BillUtils;

public class ShopDemo {

	public static final LocalDateTime DISCOUNT_DATE = LocalDateTime.of(2020, Month.MAY, 5, 5, 10);
	public static final double DISCOUNT_PRICE = 590;
	public static final double DISCOUNT_RATE = 0.9;

	public static void main(String[] args) {
		// Create 4 items
		Item galaxyS9 = new Item("mh1", "Android", "black", 1000);
		Item ip10 = new Item("mh2", "Ios", "Gold", 2000);
		Item lumia1050 = new Item("mh3", "Window phone", "Green", 1400);
		Item ip11 = new Item("mh4", "Ios", "", 3000);

		// Create 2 customer
		Customer cus1 = new Customer("1001", "Vu", "09090909", "VIetnam");
		Customer cus2 = new Customer("US002", "Trump", "0303003", "US");
		Customer cus3 = new Customer("JP001", "Saitama", "0124604", "Japan");

		Item[] firstItems = { galaxyS9, ip10 };
		Item[] secondItems = { ip11, lumia1050 };

		Bill cus1Bill = new Bill("p1", cus1, firstItems, LocalDateTime.now());
		cus1Bill.getTotalOfMoney();
		
		Bill cus1Bill2 = new Bill("p2", cus1, secondItems, LocalDateTime.now());

		BillUtils.export(cus1Bill, cus1Bill2);
		
		ItemAdv a = ItemAdv.builder().Id("HIHI").build();
		
	}




}
