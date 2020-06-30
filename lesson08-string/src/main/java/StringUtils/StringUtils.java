package StringUtils;

import java.util.function.Consumer;

public class StringUtils {
	public static void forEach(String[] students, Consumer<String> consumer) {
		
		for(String student : students) {
			consumer.accept(student);
		}
		
		
	}
}
