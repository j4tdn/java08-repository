package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.ItemDaoImpl;
import entities.Item;

public class ItemServiceImp implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImp() {
		itemDao = new ItemDaoImpl();
	}

	@Override
	public List<Item> getItems(LocalDate date) {
		Objects.requireNonNull(date,"Sales date cannot be null!!!");
		return itemDao.getItems(date);
	}

}
