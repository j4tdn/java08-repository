package utils;

public class SqlUtils {
	private SqlUtils() {
		// TODO Auto-generated constructor stub
	}

	public static <T extends AutoCloseable> void close(T... ts) {
		for (T t : ts) {
			if (t != null) {
				try {
					t.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
