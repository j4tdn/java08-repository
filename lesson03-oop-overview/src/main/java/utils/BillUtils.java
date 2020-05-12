package utils;

import bean.Bill;
import bean.Item;

public class BillUtils {

    private BillUtils() {
    }

    public static void export(Bill bill) {
        System.out.println("======================");
        System.out.println("Họ tên " + bill.getCustomer().getFullname());
        System.out.println("Danh sách sản phẩm ");
        Item[] items = bill.getItems();
        for (Item item : items) {
            System.out.print(item + " ");
            System.out.println();
        }
        System.out.println("Tổng tiền " + bill.getTotalOfMoney());

        System.out.println("======================");
    }

    public static void export(Bill ...bills){
        if(bills.length == 0){
            System.out.println("No bill exists!");
            return;
        }
        for(Bill bill : bills){
            export(bill);
        }
    }
}
