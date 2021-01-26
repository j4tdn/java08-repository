package view;

import service.OrderService;
import service.OrderServiceImpl;

public class OrderView {
	
	private static OrderService orderService;
	
	static {
		orderService = new OrderServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("updated: " + orderService.update(1));
	}
}