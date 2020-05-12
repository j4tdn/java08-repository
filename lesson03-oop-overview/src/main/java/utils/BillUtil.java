package utils;

import bean.Bill;
import bean.Item;

public class BillUtil {
	
	private BillUtil() {
		
	}
	
	
	public static void exportBill(Bill bill) {
		
		System.out.println("============");
		System.out.println("Họ tên : = "+ bill.getCustomer().getFullName());
		
		Item[] items = bill.getItems();
		
		System.out.println("============");
		System.out.println("danh sachs san pham");
		for(Item item:items) {
			System.out.println(item);
		}
	}
	public static void export(Bill ...bills) {
		
		if(bills.length ==0) {
			System.out.println("No bill exists !!!");
			return ;
		}
		
		for( Bill bill : bills) {
			exportBill(bill);
		}
		
	}
}



