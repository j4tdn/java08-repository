package utils;

public class SqlUtils {
	private SqlUtils() {

	}

	public static void close(AutoCloseable... elements) {
		for (AutoCloseable element : elements) {
			if (element != null) {
				try {
					element.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}