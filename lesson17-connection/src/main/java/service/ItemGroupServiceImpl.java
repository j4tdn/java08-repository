package service;

import java.util.List;
import java.util.Objects;

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
		Objects.requireNonNull(id, "id cannot be null");
		return itemGroupDao.get(id);
	}

	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "name cannot be null");
		return itemGroupDao.get(name);
	}
	
}