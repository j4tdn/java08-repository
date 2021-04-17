package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDto;

public class ItemService {
	private static ItemDao itemDao;
	static {
		itemDao = new HibernateItemDao();
	}

	public List<ItemDto> get(LocalDate date) {
		return itemDao.get(date);
	}

	public List<String> getHighestSaleOut(Integer year) {
		return itemDao.getHighestSaleOut(year);
	}

	public List<Item> getAll() {
		return itemDao.getAll();
	}
}
