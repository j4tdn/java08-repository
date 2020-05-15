package utils;

import bean.Item;
import bean.bill;

public class BillUtils {
	private BillUtils() {
	}

	public static void expor(bill bill) {
		System.out.println("===================");
		System.out.println("Ho ten :" + bill.getCustomer().getFullname());
		System.out.println("danh sach san pham");
		Item[] items = bill.getItem();
		for (Item item : items) {
			System.out.println(item);
		}
		System.out.println("tong tien" + bill.getTotalOfMoney());
	}

	public static void expor(bill... bills) {
		if (bills.length == 0) {
			System.out.println("no bill exits");
			return;
		}
		for (bill bill : bills) {
			expor(bill);
		}
	}
}
