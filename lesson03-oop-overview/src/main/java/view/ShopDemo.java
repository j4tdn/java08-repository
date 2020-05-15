package view;

import java.time.LocalDate;
import java.time.Month;

import bean.Bill;
import bean.Customer;
import bean.Item;
import utils.BillUtils;

public class ShopDemo {
    public static final LocalDate DISCOUNT_DATE=LocalDate.of(2020, Month.MAY, 5);
    public static final double DISCOUNT_PRICE=590;
    public static final double SALE_DATE_PRICE=0.9;
    
	public static void main(String[] args) {
		//create 4 item
		Item nokia1202=new Item("nokia1202", "TBD", "Gray", 500);
		Item lgG3=new Item("lgG3", "Android", "White", 1000);
		Item iphone6=new Item("iphone6", "IOS", "Prink", 5000);
		Item samsung=new Item("samsung", "Android", "Brown", 2000);
		
		//create 5 customer
		Customer andy=new Customer("andy", "1", "102145254","newyork");
		Customer lina=new Customer( "lina","2", "102145214","tokyo");
		
		Item[] firstitems= {nokia1202,iphone6,samsung};
		Item[] seconditems= {nokia1202,samsung};
		Item[] thirditems= {iphone6,samsung};
		
		Bill firstbill=new Bill("b01", andy,firstitems, LocalDate.of(2020, Month.MAY, 5));
		
		BillUtils.export(firstbill);
		
		Bill secondtbill=new Bill("b02", andy,seconditems, LocalDate.of(2020, Month.MAY, 03));
		//BillUtils.exportBill(secondtbill);
		Bill thirdtbill=new Bill("b03", lina,thirditems, LocalDate.of(2020, Month.MAY, 04));
		//BillUtils.exportBill(thirdtbill);
		BillUtils.export(secondtbill,thirdtbill);
		
		
		

	}

	
	
}
