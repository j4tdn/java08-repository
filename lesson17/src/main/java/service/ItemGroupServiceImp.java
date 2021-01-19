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
import persistence.ItemGroupDtoRaw;
import utils.ItemGroupDtoHelper;

public class ItemGroupServiceImp implements ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImp() {
		itemGroupDao = new ItemGroupDaoImpl();
	}

	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "id cannot be null");
		return itemGroupDao.get(id);
	}

	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "name cannot be null");
		return itemGroupDao.get(name);
	}

	public List<ItemGroupDto> getItemGroupDetail() {
		// TODO: should use another way to get itemlist
		// return itemGroupDao.getItemGroupDetail();

		// better way
		List<ItemGroupDtoRaw> rawData = itemGroupDao.getItemGroupDetailRawData();
		if (rawData.isEmpty()) {
			return Collections.emptyList();
		}

		// igID, igName, itemName, count
		// dto: igID,igName, itemList,
		Map<Pair<Integer,String>, List<ItemGroupDtoRaw>> rawDataByItemParameter = rawData.stream()
				.collect(Collectors.groupingBy(entry -> Pair.of(entry.getItemGroupId(), entry.getItemGroupName())));

		return rawDataByItemParameter.entrySet().stream().map(entry -> {
			return ItemGroupDtoHelper.convert(entry);
		}).collect(Collectors.toList());
	}

	public List<ItemGroupDtoRaw> getItemGroupDetailRawData() {
		return itemGroupDao.getItemGroupDetailRawData();
	}

}
