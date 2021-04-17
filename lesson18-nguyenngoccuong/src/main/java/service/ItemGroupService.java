package service;

import java.util.List;

import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupService {
	private static ItemGroupDao itemGroupDao;

	public ItemGroupService() {
		itemGroupDao = new ItemGroupDao();
	}

	public List<ItemGroupDto> getQuantityOfItemsInEachItemGroup() {
		return itemGroupDao.getQuantityOfItemsInEachItemGroup();
	}
	
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

}
