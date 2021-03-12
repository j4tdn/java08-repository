package service;

import java.time.LocalDate;
import java.util.List;

import entities.Items;

public interface ItemService {
	List<Items> getItems(LocalDate saleDate);
}
