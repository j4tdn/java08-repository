package connection;

import java.sql.Connection;

public interface ConnectionManager {
	Connection getConnection();// mặc định public , abstract method
	
	
}
