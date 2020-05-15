package utils;

import bean.Bill;
import bean.Item;

public class BillUtils {
	private BillUtils() {
	}

	public static void export(Bill bill) {
		System.out.println("=======================");
		System.out.println("ho ten:" + bill.getCustomer().getFullname());
		System.out.println("danh sach san pham");
		Item[] items = bill.getItems();
		for (Item item : items) {
			System.out.println(item);
		}
		System.out.println("tong tien:" + bill.getTotalofMoney());
		System.out.println("=======================");
	}
	
	public static void export(Bill ...bills) {
		if(bills.length == 0) {
			System.out.println("No bill exit!!!");
			return;
		}
		for(Bill bill: bills) {
			export(bill);
		}
	}
}
