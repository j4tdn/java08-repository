package utils;

import bean.Bill;
import bean.Item;

public class BillUtils {
	
	private BillUtils() {
		
	}
	public static void export(Bill bill) {
		System.out.println("=========================================");
		System.out.println("Ho ten: " + bill.getCustomer().getFullname());
		
		System.out.println("Danh sach san pham ");
		Item[] items = bill.getItems();
		
		for(Item item: items) {
			System.out.println(item);
		}
		
		System.out.println("Tong tien: " + bill.getTotalOfMoney());
		System.out.println("==========================================");
				 
	}
	
	//ham cung ten khac tham so overl au ding
	public static void export(Bill ...bills) {//variable: ko truyen cung dc, 1 hoac n pthu cung dc; kieu du lieu phai giong nhau
		if(bills.length == 0) {
			System.out.println("No bill exits !!!");
			return; //ham voi muon dung, nhay xuong phia duoi
		}
		for(Bill bill: bills) {
			export(bill);
		}
	}
}
