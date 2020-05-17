package view;

import bean.Item;
import utils.BillUtils;

import java.time.LocalDate;
import java.time.Month;

import bean.Bill;
import bean.Customer;

public class ShopDemo {
	public static final LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 05);
	public static final double DISCOUNT_price = 590;
	public static final double SALE_RATE_PRICE = 0.9;

	public static void main(String[] args) {
		// create 4 Item
		Item nokia1202 = new Item("nokia", "TBD", "Gray", 100);
		Item LGg3 = new Item("LGg3", "Androi", "While", 600);
		Item iphone6 = new Item("iphone6", "IOS", "Pink", 880);
		Item galaxyS10 = new Item("galaxyS10", "Androi", "Gray", 720);

		// create 2 customer
		Customer andy = new Customer("123", "Andy", "0123456", "Newyork");
		Customer john = new Customer("123", "John", "6449238", "Call");

		Item[] firstitems = { nokia1202, iphone6, galaxyS10 };
		Item[] seconditems = { nokia1202, galaxyS10 };
		Item[] thirditems = { iphone6, galaxyS10 };

		Bill firstbill = new Bill("b01", andy, firstitems, LocalDate.of(2020, Month.MAY, 05));
		//firstbill.getTotalofMoney();

		Bill secondtbill = new Bill("b02", andy, seconditems, LocalDate.of(2020, Month.MAY, 04));
		
		Bill thirdtbill = new Bill("b03", john, thirditems, LocalDate.of(2020, Month.MAY, 03));
		BillUtils.export(secondtbill,thirdtbill);
	}

	

	

}
