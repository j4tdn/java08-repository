package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Bill;
import bean.Customer;
import bean.Item;
import utils.BillUtils;

public class ShopDemo {

	public static final LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 5);
	public static final double DISCOUNT_PRICE = 590;
	public static final double SALE_RATE_PRICE = 0.9;

	public static void main(String[] args) {
		// Create 4 items
		Item nokia1202 = new Item("nokia12020", "TBD", "Gray", 100);
		Item lgG3 = new Item("lgG3", "Android", "White", 660);
		Item iphone6 = new Item("iphone6", "IOS", "Pink", 800);
		Item galaxyS10 = new Item("galaxyS10", "Android", "Black", 720);

		// Create 2 customers
		Customer andy = new Customer("123", "Andy", "0123456", "New York");
		Customer john = new Customer("456", "John", "6543210", "Cali");

		Item[] firstItems = { nokia1202, iphone6, galaxyS10 };
		Item[] secondItems = { nokia1202, galaxyS10 };
		Item[] thirdItems = { iphone6, galaxyS10 };

		Bill firstBill = new Bill("b01", andy, firstItems, LocalDate.of(2020, Month.MAY, 05));
		BillUtils.export(firstBill);

		Bill secondBill = new Bill("b02", andy, secondItems, LocalDate.of(2020, Month.MAY, 03));
		Bill thirdBill = new Bill("b03", john, thirdItems, LocalDate.of(2020, Month.MAY, 03));
		BillUtils.export(secondBill, thirdBill);

	}

	



}
