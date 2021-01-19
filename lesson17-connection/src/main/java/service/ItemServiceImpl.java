package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.ItemDaoImpl;
import entities.Items;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new ItemDaoImpl();
	}

	@Override
	public List<Items> getItems(LocalDate saleDate) {
		Objects.requireNonNull(saleDate, "Sale date is not null");
		return itemDao.getItems(saleDate);
	}

}
