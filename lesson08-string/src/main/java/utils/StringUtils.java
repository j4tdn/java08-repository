package utils;

import java.util.function.Consumer;

public class StringUtils {
	private StringUtils() {
		
	}
	
	public static void forEach(String[] elements, Consumer<String> consumer) {
		for (String element : elements) {
			consumer.accept(element);
		}
	}
}
