package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.ItemDaoImpl;
import entities.Item;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new ItemDaoImpl();
	}

	public List<Item> getItems(LocalDate saleDate) {
		Objects.requireNonNull(saleDate, "Sale date is not null");
		return itemDao.getItems(saleDate);
	}
}
