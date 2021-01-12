package utils;

import java.io.Closeable;
import java.io.IOException;

public class SqlUtils {
	private SqlUtils() {

	}

	public static <T extends AutoCloseable> void close(T... ts) {
		for (T t : ts) {
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
