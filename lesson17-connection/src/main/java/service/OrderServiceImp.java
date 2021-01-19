package service;

import java.util.Objects;

import dao.OrderDao;
import dao.OrderDaoImpl;

public class OrderServiceImp implements OrderService {

	private OrderDao orderDao;

	public OrderServiceImp() {
		orderDao = new OrderDaoImpl();
	}
	
	public boolean update(int orderId) {
		Objects.requireNonNull(orderId,"Order id cannot be null!!!");
		return orderDao.update(orderId);
	}

}
