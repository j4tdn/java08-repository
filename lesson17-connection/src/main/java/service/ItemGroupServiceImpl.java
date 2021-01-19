package service;

import java.util.List;
import java.util.Objects;

import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import entities.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupDtoRaw;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
	
	 public ItemGroupServiceImpl() {
		 itemGroupDao = new ItemGroupDaoImpl();
	}
	@Override
	public List<ItemGroup> getAll() {
		// TODO Auto-generated method stub
		return itemGroupDao.getAll();
	}
	@Override
	public ItemGroup getItem(Integer id) {
		Objects.requireNonNull(id, "id cannot be null");
		return itemGroupDao.getItem(id);
	}
	
	@Override
	public ItemGroup getItem(String name) {
		Objects.requireNonNull(name, "name cannot be null");
		return itemGroupDao.getItem(name);
	}
	@Override
	public List<ItemGroupDto> getItemGroupDetail() {
		return itemGroupDao.getItemGroupDetail();
	}
	@Override
	public List<ItemGroupDtoRaw> getItemGroupDetailRawData() {
		// TODO Auto-generated method stub
		return null;
	}

}
