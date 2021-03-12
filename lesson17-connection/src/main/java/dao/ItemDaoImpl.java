package dao;

import java.util.List;

import entities.Item;

public class ItemDaoImpl implements ItemDao{

	@Override
	public List<Item> getItems(int itemGroupId, double saleFrom, double saleTo) {
		final String query = "SELECT *"
				+ "\nFROM MatHang"
				+ "\nWHERE MaLoai = ?"
				+ "\nWHERE MaLoai = ?"
				+ "\nWHERE MaLoai = ?";
		return null;
	}
	

}
