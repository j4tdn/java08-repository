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
import persstence.ItemGroupDto;
import persstence.ItemGroupDtoHelper;
import persstence.ItemGroupDtoRaw;


public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new ItemGroupDaoImpl();
	}


	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}


	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "id can not null");
		return itemGroupDao.get(id);
	}

	
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "name can not null");
		return itemGroupDao.get(name);
	}


	public List<ItemGroupDto> getItemGroupDetail() {
		List<ItemGroupDtoRaw> rawData = itemGroupDao.getItemGroupDetailRawData();
		if (rawData.isEmpty()) {
			return Collections.emptyList();
		}
		Map<Pair<Integer, String>, List<ItemGroupDtoRaw>> rawDataByItemParameter = rawData.stream()
				.collect(Collectors.groupingBy(entry -> Pair.of(entry.getItemGroupId(), entry.getItemGroupName())));

		return rawDataByItemParameter.entrySet().stream().map(entry -> {
			return ItemGroupDtoHelper.convert(entry);
		}).collect(Collectors.toList());
	}


	public List<ItemGroupDtoRaw> getItemGroupDetailRaw() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemGroupDetailRawData();
	}


	
}