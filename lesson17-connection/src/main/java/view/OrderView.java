package view;


import service.OrderService;
import service.OrderServiceImp;

public class OrderView {
	private final static OrderService orderService;
	
	static {
		orderService = new OrderServiceImp(); 
	}
	public static void main(String[] args) {
		System.out.println("update : "+orderService.update(3));
	}
}
