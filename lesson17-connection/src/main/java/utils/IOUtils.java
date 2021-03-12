package utils;

import java.util.List;

public class IOUtils {
 public IOUtils() {
	// TODO Auto-generated constructor stub
}
 public static <E>  void println( List<E> elements) {
	for (E element : elements) {
		System.out.println(element);
	}
}
}
