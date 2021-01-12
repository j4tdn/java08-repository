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
	
	public List<ItemGroup> getAll(){
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup get(Integer id) {
		// TODO Auto-generated method stub
		return itemGroupDao.get(id);
	}

	@Override
	public ItemGroup get(String name) {
		// TODO Auto-generated method stub
		return itemGroupDao.get(name);
	}
}