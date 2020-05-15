package utils;

import bean.Bill;
import bean.Item;

public class BillUtils {
	private BillUtils() {
	}
	public static void export(Bill bill) {
		System.out.println("=====================");
		System.out.println("Họ tên: " + bill.getCustomer().getFullname());
		System.out.println("Danh sách sản phẩm: ");
		Item[] items = bill.getItems();
		for (Item item : items) {
			System.out.println(item);
		}
		System.out.println("Tổng tiền: " + bill.getTotalOfMoney());
		System.out.println("=====================");
	}
	//... là variable, gần giống 1 mảng, nhưng k cần tạo mảng, có thể truyền 1 phần tử hoặc nhiều phần tử
	public static void export(Bill ...bills) {
		if(bills.length == 0) {
			System.out.println("No bill exist!");
			return;
		}
		for (Bill bill : bills) {
			export(bill);
		}
	}

}
