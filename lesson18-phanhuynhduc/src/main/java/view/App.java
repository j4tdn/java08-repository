package view;

import dao.MatHangDao;
import dao.MatHangDaoImpl;
import persistence.InventoryCategory;
import persistence.ItemOfCategory;
import persistence.MatHang;

import java.util.List;

public class App {

    public static void main(String[] args) {
        MatHangDao matHangDao = new MatHangDaoImpl();



        List<MatHang> matHangList = matHangDao.getMatHangBanNhieuNhat(2020);

        List<InventoryCategory> inventoryCategoryList = matHangDao.getInventoryCategory();

        List<ItemOfCategory> itemOfCategoryList = matHangDao.getItemOfCategory();


        System.out.println("--------------- cau 3 ---------");
        for (MatHang mh : matHangList){
            System.out.println(mh);
        }
        System.out.println("----------------- cau 2---------------");
        for(InventoryCategory inventoryCategory : inventoryCategoryList){
            System.out.println(inventoryCategory);
        }


        System.out.println("---------------- cau 4-------------------");
        for(ItemOfCategory itemOfCategory : itemOfCategoryList){
            System.out.println(itemOfCategory);
        }


    }
}
