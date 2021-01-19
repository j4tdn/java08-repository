package service;

import dao.OrderDao;
import dao.OrderDaoImpl;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao ;

    public OrderServiceImpl(){
        orderDao = new OrderDaoImpl();
    }




    @Override
    public boolean updateOrder(int orderId) {
        return orderDao.update(orderId);
    }
}
