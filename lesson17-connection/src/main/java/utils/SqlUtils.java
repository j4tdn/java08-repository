package utils;

public class SqlUtils {

	private SqlUtils() {

	}

	public static  void close(AutoCloseable ...elements) {
		for (AutoCloseable element : elements) {
			if (element != null) {
				try {
					element.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
