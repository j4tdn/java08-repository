package service;

import java.util.List;

import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import entities.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService{

	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new ItemGroupDaoImpl();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup getById(Integer id) {
		return itemGroupDao.getById(id);
	}

	@Override
	public ItemGroup getByName(String name) {
		return itemGroupDao.getByName(name);

	}

}
