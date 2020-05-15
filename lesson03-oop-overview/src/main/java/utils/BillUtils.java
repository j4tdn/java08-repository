package utils;

import bean.Bill;
import bean.Item;

public class BillUtils {
	private BillUtils() {

	}

	public static void export(Bill bill) {
		System.out.println("=============");
		System.out.println("Ho ten: " + bill.getCustomer().getFullName());

		System.out.println("Danh sach san pham:");
		Item[] items = bill.getItems();
		for (Item item : items) { // vua for vua duyet tung phan tu
			System.out.println(item);
		}
		System.out.println("Tong tien: " + bill.getTotalMoney());
		System.out.println("=============");
	}

	public static void export(Bill... bills) { // khong truyen phan tu hay truyen n phan tu deu duoc
		if (bills.length == 0) {
			System.out.println("No bill exits !!!");
			return;
		}
		for (Bill bill : bills) {
			export(bill);
		}
	}
}
