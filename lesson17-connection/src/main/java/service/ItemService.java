package service;

import java.time.LocalDate;
import java.util.List;

import entities.Item;

public interface ItemService {
	List<Item> getItems(LocalDate saleDate);
}
