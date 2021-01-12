package utils;

public class SqlUtil {
	private SqlUtil() {
		
	}
	public static <E extends AutoCloseable> void close (E ...elements) {
		
		for (E element:elements) {
			if (element != null) {
				try {
					element.close();
				} catch (Exception e) {
				}
			}
		}
	
	}
}
