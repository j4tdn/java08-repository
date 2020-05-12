package view;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

import bean.Bill;
import bean.Customer;
import bean.Item;
import bean.ItemAdv;
import bean.ItemAdv.Builder;
import utils.BillUtil;

import bean.ItemAdv;
public class ShopDemo {
	public static final LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 05);
	
	

	public static void main(String[] args) {
		
		
		ItemAdv item3 = ItemAdv.build().name("Hello").shortName("phd").build();
		
		System.out.println(item3.getName());
		
		
		
		
		
		
//		// create 4 item 		
//		Item nokia1202 = new Item("nokia1202","TBD","Gray",100);
//		
//		Item lgG3 = new Item("lgG3","Android", "White",600);
//		
//		Item iphone6 = new Item("iphone6","IOS","Pink", 800);
//		
//		Item galaxyS10 = new Item("galaxyS10","Android","Black",1000);
//		
//		
//		Item[] firstItems = {
//				nokia1202, iphone6 , galaxyS10
//		};
//		Item[] secondItems = {
//				nokia1202, galaxyS10
//		};
//		Item[] thirdItems = {
//			iphone6, galaxyS10	
//		};
//		
//		
//		
//		
//		//create 5 customer	
//		Customer andy = new Customer("123","Andy","0123456","New York");
//		Customer john  = new Customer("456","John","0654321","Cali");
//		
//		
//		//create Bill 
//		
//		//01
//		Bill firstBill = new Bill(andy,firstItems,"b01",LocalDate.of(2020,Month.MAY,05));
//		
//		//02 Bill 
//		Bill secondBill = new Bill(andy,secondItems, "b02",LocalDate.of(2020, Month.MAY,13 ));
//		
//		//03 Bill 
//		
//		Bill thirdBill = new Bill(john,thirdItems,"b03",LocalDate.of(2020, Month.MAY, 10));
//		
//		
//		//firstBill.setTotalOfMoney(calCulated(firstBill));
//		
//		//}
//		
//		System.out.println(firstBill.getTotalOfMoney());
//		
//		BillUtil.exportBill(firstBill);
//		
//		
//		BillUtil.export(secondBill, thirdBill);
//		
//		
//		
//		
//		
//		}
//	
//	
	}
	
		
}
