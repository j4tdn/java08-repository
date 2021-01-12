package utils;

import java.util.List;

public class IOUtils {

	private  IOUtils() {
		
	}
	public static <E> void printf (List<E> elements) {
		elements.forEach(System.out::println);
	}
	
}
