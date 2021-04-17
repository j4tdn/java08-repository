package service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import dao.ItemDao;
import dto.ItemWithSaleDateDto;
import persistence.Item;

public class ItemService {
	private ItemDao itemDao;

	public ItemService() {
		itemDao = new ItemDao();
	}

	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	public List<ItemWithSaleDateDto> getItemInSaleDate(LocalDate date) {
		return itemDao.getItemsSaleInDate(date);
	}

	public List<String> getNameItemBestSellerInYear(int year) {
		return itemDao.getBestSellerInYear(year);
	}
}
