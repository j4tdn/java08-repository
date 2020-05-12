package utils;

import java.util.Arrays;

import bean.Bill;

public class BillUtils {

	private BillUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void export(Bill bill) {
		System.out.println("========================");
		System.out.println("Ho ten: " + bill.getCustomer().getName());
		System.out.println("Danh sach san pham: ");
		Arrays.stream(bill.getItems()).forEach(System.out::println);
		System.out.println("Tong tien: " + bill.getTotalOfMoney());
		System.out.println("========================");
	}

	public static void export(Bill... bills) {
		if (bills.length == 0) {
			System.out.println("No bill exist !!!");
			return;
		}
		for (Bill bill : bills) {
			export(bill);
		}
	}
}
