package view;

import bean.Bill;
import bean.Customer;
import bean.Item;
import utils.BillUtils;

import java.time.LocalDate;
import java.time.Month;

public class ShopDemo {
    public static final LocalDate DISCOUNT_DATE = LocalDate.of(2020, Month.MAY, 05);
    public static final double DISCOUNT_PRICE = 590;
    public static final double SALE_RATE_PRICE = 0.9;

    public static void main(String[] args) {
        //create 4 items
        Item nokia1202 = new Item("nokia1202", "Symbian", "Blue", 500);
        Item iphone7 = new Item("iphone7", "IOS", "White", 800);
        Item lgG3 = new Item("lgG3", "Android", "Pink", 660);
        Item iphone11ProMax = new Item("iphone11ProMax", "IOS", "Green", 700);

        //create 2 customers
        Customer nhi = new Customer("1", "Nhi", "0900000000", "Hue");
        Customer andy = new Customer("2", "Andy", "0900000111", "Quang Nam");
        Customer john = new Customer("3", "John", "0900000122", "Quang Tri");

        Item[] firstItems = {nokia1202, iphone7, lgG3};
        Item[] secondItems = {nokia1202, lgG3};
        Item[] thirdItems = {iphone11ProMax, iphone7};

        Bill firstBill = new Bill("b01", nhi, firstItems, LocalDate.of(2020, Month.MAY, 05));
        BillUtils.export(firstBill);
        Bill secondBill = new Bill("b02", nhi, secondItems, LocalDate.of(2020, Month.MAY, 03));
        //BillUtils.export(secondBill);
        Bill thirdBill = new Bill("b03", john, thirdItems, LocalDate.of(2020, Month.MAY, 04));
        //BillUtils.export(thirdBill);
        BillUtils.export(secondBill, thirdBill);

    }
}
