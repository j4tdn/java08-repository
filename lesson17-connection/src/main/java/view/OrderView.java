package view;

import service.OrderService;
import service.OrderServiceImpl;

public class OrderView {
private static OrderService orderService;
	
	static {
		orderService = new OrderServiceImpl();
	}
	
	public static void main(String[] args) {
		
		var isUpdated = orderService.update(2);
		System.out.println(isUpdated);
	}
}
