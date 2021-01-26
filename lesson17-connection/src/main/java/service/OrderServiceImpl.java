package service;



import dao.OrderDao;
import dao.OrderDaoImpl;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao;

	public OrderServiceImpl() {
		orderDao = new OrderDaoImpl();
	}


	public boolean update(int orderId) {
		
		return orderDao.update(orderId);
	}

}

