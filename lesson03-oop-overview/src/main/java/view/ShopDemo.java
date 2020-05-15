package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Bill;
import bean.Customer;
import bean.Item;
import utils.BillUtils;

public class ShopDemo {
	public static final LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 05);
	public static final double DISCOUNT_PRICE = 590;
	public static final double SALE_RATE_PRICE = 0.9;
	
	public static void main(String[] args) {
		//create 4 items
		Item nokia1202 = new Item("nokia1201","tbd", "grey", 100);
		Item lgG3 = new Item("lgG3", "android", "white", 300);
		Item iphone6 = new Item("iphone6", "ios","black", 1000);
		Item galaxyS10 = new Item("GalaxyS10","android", "blue", 800);
		//create 2 customers
		Customer Jess = new Customer("123", "Jess", "0123", "DN");
		Customer John = new Customer("456", "John", "0456", "DN");
		Item[] firstItem = {nokia1202, lgG3, iphone6};
		Item[] secondItem = {nokia1202, lgG3};
		Item[] thirdItem = {nokia1202, iphone6};
		
		Bill firstBill = new Bill("b01", Jess, firstItem, LocalDate.of(2020, Month.MAY, 05));
		//calculateBill(firstBill);
		//BillUtils.export(firstBill);
		Bill secondBill = new Bill("b01", Jess, secondItem, LocalDate.of(2020, Month.MAY, 03));
		//BillUtils.export(secondBill);
		Bill thirdBill = new Bill("b01", John, thirdItem, LocalDate.of(2020, Month.MAY, 02));
		//BillUtils.export(thirdBill);
		BillUtils.export(secondBill,thirdBill);
	}

}
