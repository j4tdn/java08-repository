package connection;

import java.sql.Connection; //để biết kết nối được hay ko

public interface ConnectionManager {
	Connection getConnection(); //mặc định public
}
