package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.TypeItemDao;
import dto.ItemInSaleDateDto;
import dto.TypeItemDetailDto;
import dto.TypeItemDto;

public class TypeItemService {
	TypeItemDao typeItemDao;
	
	public TypeItemService() {
		typeItemDao = new TypeItemDao();
	}
	
	public List<TypeItemDto> getTypeItemWithQuantity() {
		return typeItemDao.getTypeItemWithQuantity();
	}
	
	public List<TypeItemDetailDto> getTypeItemDetail() {
		return typeItemDao.getTypeItemDetail();
	}
}
