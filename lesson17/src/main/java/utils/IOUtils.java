package utils;

import java.util.List;

public class IOUtils {

	public IOUtils() {
	}

	public static <E> void printf(List<E> elements) {
		for (E e : elements) {
			System.out.println(e);
		}
	}
	
}
