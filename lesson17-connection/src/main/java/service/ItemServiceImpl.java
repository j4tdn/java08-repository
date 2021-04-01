package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.ItemDaoImpl;
import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import entities.Item;

public class ItemServiceImpl implements ItemService {
	private final ItemDao itemDao; //bắt buộc khởi tạo trong hàm khởi tạo

	public ItemServiceImpl() {
		itemDao = new ItemDaoImpl() {
		};
	}
	
	public List<Item> getItems(LocalDate salesDate) {
		return itemDao.getItems(salesDate);
	}

	@Override
	public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo) {
		return itemDao.getItem(itemGroupId, saleFrom, saleTo);
	}
}
