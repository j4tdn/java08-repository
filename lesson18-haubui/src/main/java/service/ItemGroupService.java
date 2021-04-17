package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupService {
	private static ItemGroupDao itemGroupDao;
	static {
		itemGroupDao = new HibernateItemGroupDao();
	}

	public List<ItemGroupDto> getTotalOfItem() {
		return itemGroupDao.getTotalOfItem();
	}

}
