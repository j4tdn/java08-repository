package utils;

public class SqlUtils {
	private SqlUtils() {
		
	}
	
	public static void close(AutoCloseable ...ts) {
		for (AutoCloseable t: ts) {
			if (t != null) {
				try {
					t.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
