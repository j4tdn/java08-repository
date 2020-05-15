package view; //show cho nguoi dung xem

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
		//Create a Items
		Item nokia1202 = new Item("nokia1202","TBD", "Gray", 100); //co the dung ENUM
		Item lgG3 = new Item("lgG3","Android", "White", 660);
		Item Iphone6 = new Item("IP", "IOS", "Pink", 800);
		Item galaxyS10 = new Item("galaxyS10","Android", "Black", 720);
		
		//Create 2 Customer
		Customer andy = new Customer("123", "Andy", "0123456", "New York");
		Customer john = new Customer("456", "John", "6543210", "Cali");
		
		Item[] firstItems = {nokia1202, Iphone6, galaxyS10};
		Item[] secondItems = {nokia1202, galaxyS10};
		Item[] thirdItems = {Iphone6, galaxyS10};
		
		Bill firstBill = new Bill("b01", andy, firstItems, LocalDate.of(2020, Month.MAY, 05));
		//calculateBill();
		//exportBill(firstBill);
		BillUtils.export(firstBill);
		
		Bill secondtBill = new Bill("b02", andy, secondItems, LocalDate.of(2020, Month.MAY, 03));
		BillUtils.export(secondtBill);
		
		Bill thirdtBill = new Bill("b03", john, thirdItems, LocalDate.of(2020, Month.MAY, 03));
		//BillUtils.export(thirdtBill);
		BillUtils.export(secondtBill, thirdtBill);
		
	}
	
}

