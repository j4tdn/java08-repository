package dao;

import java.time.LocalDate;
import java.util.List;

import entities.Items;

public interface ItemDao {
	List<Items> getItems(LocalDate saleDate);
}
