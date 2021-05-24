package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;
import persistence.ItemDto;


public class ItemServiceImpl implements ItemService{

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao=new HibernateItemDao();
	}
	
	public List<Item> getAll() {
		
		return itemDao.getAll();
	}

	@Override
	public Item get(int id) {
		return itemDao.get(id);
	}

	@Override
	public List<ItemDto> getItemDtos() {
		// TODO Auto-generated method stub
		return itemDao.getItemDtos();
	}

	@Override
	public void save(Item item) {
		itemDao.save(item);
		
	}

	@Override
	public Item getFirstLevelCache(int id) {
		return itemDao.getFirstLevelCache(id);
	}

	@Override
	public Item getFirstLevelCacheInTwoSession(int id) {
		
		return itemDao.getFirstLevelCacheInTwoSession(id);
	}

	@Override
	public Item getSecondLevelCache(int id) {
		return itemDao.getSecondLevelCache(id);
	}
}
