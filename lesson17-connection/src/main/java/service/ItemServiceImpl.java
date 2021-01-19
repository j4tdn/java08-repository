package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.ItemDaoImpl;
import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import entities.Item;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new ItemDaoImpl() {
		};
	}
	
	public List<Item> getItems(LocalDate salesDate) {
		return itemDao.getItems(salesDate);
	}
}
