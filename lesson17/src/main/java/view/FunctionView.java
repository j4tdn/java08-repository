package view;

import dao.FunctionDao;
import dao.FunctionDaoImpl;

import java.sql.SQLException;

public class FunctionView {
    public static void main(String[] args) throws SQLException {
        FunctionDao functionDao = new FunctionDaoImpl();

        System.out.println(functionDao.getSum(10));
    }
}
