package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.ItemDaoImpl;
import entities.Item;

public class ItemServiceImpl implements ItemService{
	
	private final ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new ItemDaoImpl();
	}
	
	@Override
	public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo) {
		return itemDao.getItems(itemGroupId, saleFrom, saleTo);
	}

	@Override
	public List<Item> getItems(LocalDate salesDate) {
		Objects.requireNonNull(salesDate, "Sales date can not be null");
		return itemDao.getItems(salesDate);
	}
}
