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

	private final ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new ItemGroupDaoImpl();
	}
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	@Override
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "id cannot be null");
		return itemGroupDao.get(id);
	}
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "id cannot be null");
		return itemGroupDao.get(name);
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetail() {
		// TODO: should use another way to get itemList
		// return itemGroupDao.getItemGroupDetail();
		
		//  better way
		List<ItemGroupDtoRaw> rawData = itemGroupDao.getItemGroupDetailRawData();
		if (rawData.isEmpty()) {
			return Collections.emptyList();
		}
		
		// raw: igId, igName, itemName, itemName, count
		// dto: igId, igName, itemList<itemName, count>, total
		Map<Pair<Integer, String>, List<ItemGroupDtoRaw>> rawDataIgId = rawData.stream()
				.collect(Collectors.groupingBy(entry -> Pair.of(entry.getItemGroupId(), entry.getItemGroupName())));
		
		return rawDataIgId.entrySet() // Set<Entry<Pair, List<ItemGroupDtoRaw>>
					.stream() // Stream<Entry<Pair, List<ItemGroupDtoRaw>> 
					.map(entry ->  ItemGroupDtoHelper.convert(entry)) // Stream<>
					.collect(Collectors.toList());
		
		
	}

}
