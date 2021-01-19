package dao;

import java.sql.SQLException;

public interface FunctionDao {
    int getSum(int number) throws SQLException;
}
