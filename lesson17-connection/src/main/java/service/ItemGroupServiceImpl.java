package service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;

import dao.ItemGroupDao;
import dao.ItemGroupDaoImpl;
import entities.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemGroupDtoHelper;
import persistence.ItemGroupDtoRaw;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
    public ItemGroupServiceImpl() 
	 {
		itemGroupDao = new ItemGroupDaoImpl();
	}
	public List<ItemGroup> getAll() {
		
		return itemGroupDao.getAll();
	}
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "is cannot be null");
		return itemGroupDao.get(id);
	}
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "is cannot be null");

		return itemGroupDao.get(name);
	}
	@Override
	public List<ItemGroupDto> getItemGroupDetail() {
		//TODO: should use another way to get itemList
		//return itemGroupDao.getItemGroupDetail();
		
		//better way
		List<ItemGroupDtoRaw> rawData = itemGroupDao.getItemGroupDetailRawData();
		if (rawData.isEmpty()) {
			return Collections.emptyList();
		}
		// raw: igId, igName, itemName, count
		// dto: igId, igName, itemList<itemName, count>, total
		Map<Pair<Integer,String>, List<ItemGroupDtoRaw>> rawDataByItemParameter =  rawData.stream()
				.collect(Collectors.groupingBy(entry -> Pair.of(entry.getItemGroupId(), entry.getItemGroupName())));
		return rawDataByItemParameter.entrySet() //Set<Entry<Integer, List<ItemGroupDtoRaw>>
				.stream()
				.map(entry -> ItemGroupDtoHelper.convert(entry))// Stream<ItemGroupDto>
				.collect(Collectors.toList());
		
	}
	

}
