package utils;

import java.awt.List;

import bean.Bill;
import bean.Item;

public class BillUtils {

	private BillUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void export(Bill bill) {
		System.out.println("====================");
		System.out.println("Họ tên: " + bill.getCustomer().getFullname());
		System.out.println("Danh sách sản phẩm");
		Item[] items = bill.getItems();
		for (Item item : items) {
			System.out.println(item);
		}
		System.out.println("Tổng tiền: " + bill.getTotalOfMoney());
		System.out.println("====================");
	}

	public static void export(Bill... bills) { // variable ... (tuc la 0 or n phan tu cua kieu du lieu do
		if (bills.length == 0) {
			System.out.println("no bill exits");
			return;
		}
		for (Bill bill : bills) {
			export(bill);
		}
	}

	/*
	public static void export(java.util.List<Bill> bills) { // variable ...(tuc la 0 or n phan tu cua kieu du lieu do
		if (bills.size() == 0) {
			System.out.println("no bill exits");
			return;
		}
		for (Bill bill : bills) {
			export(bill);
		}
	}
*/
	
}
