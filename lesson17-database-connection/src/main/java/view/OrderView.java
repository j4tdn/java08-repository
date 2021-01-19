package view;

import service.OrderService;
import service.OrderSeviceImpl;

public class OrderView {
	private static OrderService orderService;
	
	static {
		orderService = new OrderSeviceImpl();
	}

	public static void main(String[] args) {
		boolean result = orderService.update(1);
		System.out.println(result);
	}
}
