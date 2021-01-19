package service;

import dao.OrderDao;
import dao.OrderDaoImpl;

public class OrderSeviceImpl implements OrderService {
	private OrderDao orderDao;
	
	public OrderSeviceImpl() {
		orderDao = new OrderDaoImpl();
	}

	@Override
	public boolean update(int orderId) {
		return orderDao.update(orderId);
	}
}
