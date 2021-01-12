package service;

import java.util.List;

import dao.ItamGroupDaoImpl;
import dao.ItemGroupDao;
import entities.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
	public ItemGroupServiceImpl() {
		itemGroupDao=new ItamGroupDaoImpl();
	}
	public List<ItemGroup> getAll() {
		// TODO Auto-generated method stub
		return itemGroupDao.getAll();
	}
	public ItemGroup get(Integer id) {
		// TODO Auto-generated method stub
		return itemGroupDao.get(id);
	}
	public ItemGroup get(String name) {
		// TODO Auto-generated method stub
		return itemGroupDao.get(name);
	}
}
