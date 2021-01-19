package service;

import dao.ItemDao;
import dao.ItemDaoImpl;
import dao.OrderDao;
import dao.OrderDaoImpl;

public class OrderServiceImpl  implements OrderService{
	private final OrderDao orderDao;
	
	public OrderServiceImpl() {
		orderDao = new OrderDaoImpl();
	}
	@Override
	public boolean update(int orderId) {
		return orderDao.update(orderId);
	}

}
