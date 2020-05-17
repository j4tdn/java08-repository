package com.haubui.lesson03_oop_overview.utils;

import com.haubui.lesson03_oop_overview.bean.Bill;
import com.haubui.lesson03_oop_overview.bean.Item;

public class BillUtils {

	private BillUtils() {
	}

	private static void export(Bill bill) {
		System.out.println("===============================");
		System.out.println("Họ tên: " + bill.getCustomer().getFullName());
		System.out.println("Danh sách các sản phẩm: ");
		Item[] items = bill.getItems();
		for (Item item : items) {
			System.out.println(item);
		}
		System.out.println("Tổng tiền: " + bill.getPriceTotal());
	}

	public static void export(Bill... bills) {
		if (bills.length == 0) {
			System.out.println("éo có bill nào !!!");
			return;
		}
		for (Bill bill : bills) {
			export(bill);
		}
	}

}
