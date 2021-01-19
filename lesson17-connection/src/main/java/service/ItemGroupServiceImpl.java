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

public class ItemGroupServiceImpl implements ItemGroupService {

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
		Objects.requireNonNull(id, "Id cannot be null");

		return itemGroupDao.getById(id);
	}

	@Override
	public ItemGroup getByName(String name) {
		Objects.requireNonNull(name, "Name cannot be null");
		return itemGroupDao.getByName(name);

	}

	@Override
	public List<ItemGroupDto> getListItemGroupDetail() {

		var rawData = itemGroupDao.getListItemGroupDetailRaw();
		if (rawData.isEmpty()) {
			return Collections.emptyList();
		}
		Map<Pair<Integer, String>, List<ItemGroupDtoRaw>> rawDataByItemParameter = rawData.stream()
				.collect(Collectors.groupingBy(entry -> Pair.of(entry.getItemGroupId(), entry.getItemGroupName())));

		return rawDataByItemParameter.entrySet().stream().map(entry -> {
			ItemGroupDto dto = new ItemGroupDto();
			dto.setItemGroupId(entry.getKey().getLeft());
			dto.setItemGroupName(entry.getKey().getValue());

			return dto;
		}).collect(Collectors.toList());
	}

}
