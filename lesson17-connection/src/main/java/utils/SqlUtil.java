package utils;

import java.io.Closeable;
import java.io.IOException;

public class SqlUtil {
	public SqlUtil() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public static <T extends AutoCloseable> void close(T... elements) {
		for (T element : elements) {
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

//	public static void close (AutoCloseableelements) {
//		for (AutoCloseable element : elements) {
//			if (element != null) {
//				try {
//					element.close();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
}
