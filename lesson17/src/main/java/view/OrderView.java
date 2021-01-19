package view;

import service.ItemGroupServiceImp;
import service.ItemServiceImpl;
import service.OrderService;
import service.OrderServiceImpl;

public class OrderView {
    private final static OrderService orderService ;

    static {

        orderService = new OrderServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println(orderService.updateOrder(3));
    }
}
