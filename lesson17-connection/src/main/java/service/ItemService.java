package service;

import java.time.LocalDate;
import java.util.List;

import entities.Item;

public interface ItemService {
	public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo);
	public List<Item> getItems(LocalDate salesDate);

}
