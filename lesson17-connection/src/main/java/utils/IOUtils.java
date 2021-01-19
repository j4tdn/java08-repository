package utils;

import java.util.List;

public class IOUtils {

	private IOUtils() {
		// TODO Auto-generated constructor stub
	}

	public static <E> void printf(List<E> elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		
	}

}
