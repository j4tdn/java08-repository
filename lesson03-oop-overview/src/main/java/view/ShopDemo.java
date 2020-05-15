package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Bill;
import bean.Customer;
import bean.Item;
import utils.BillUtils;

public class ShopDemo {
	public static final LocalDate discount_date = LocalDate.of(2020, Month.MAY, 05);
	public static final double discount_price = 590;
	public static final double sale_rate_price = 0.9;

	public static void main(String[] args) {
		// Create 4 Items
		Item nokia1202 = new Item("nokia1202", "TBD", "Gray", 100); // goi den phuong thuc khoi tao
		Item lgG3 = new Item("lgG3", "Android", "White", 660);
		Item iphone6 = new Item("iphone6", "IOS", "Pink", 800);
		Item galaxyS10 = new Item("galaxyS10", "Android", "Black", 720);

		// Create 2 customers
		Customer andy = new Customer("123", "Andy", "0123456", "NY");
		Customer join = new Customer("456", "Join", "7894352", "Cali");

		//
		Item[] firstitems = { nokia1202, iphone6, galaxyS10 };
		Item[] seconditems = { nokia1202, iphone6 };
		Item[] thirditems = { iphone6, galaxyS10 };

		//
		Bill firstBill = new Bill("b01", andy, firstitems, LocalDate.of(2020, Month.MAY, 05));
		BillUtils.export(firstBill);

		Bill secondBill = new Bill("b02", andy, seconditems, LocalDate.of(2020, Month.MAY, 03));
		// BillUtils.export(secondBill);
		
		Bill thirdBill = new Bill("b03", join, seconditems, LocalDate.of(2020, Month.APRIL, 05));
		// BillUtils.export(thirdBill);
		BillUtils.export(secondBill,thirdBill);

	}

}
