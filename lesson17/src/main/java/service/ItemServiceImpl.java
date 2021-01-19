package service;

import dao.ItemDao;
import dao.ItemDaoImpl;
import entities.Item;


import java.sql.SQLException;
import java.time.LocalDate;

import java.util.List;

public class ItemServiceImpl implements ItemService{


    private ItemDao itemDao;

    public ItemServiceImpl(){
        this.itemDao = new ItemDaoImpl();
    }



    @Override
    public List<Item> getItems(LocalDate salesDate)  {

        return itemDao.getItems(salesDate);
    }
}
