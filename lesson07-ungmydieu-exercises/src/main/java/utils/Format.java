package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Format {
	public static String toString(Calendar c, String pattern) {
		if (c == null) {
			throw new RuntimeException("Calendar can not be null");
		}
		
		if (pattern == null) {
			return new SimpleDateFormat().format(c.getTime());
		}
		return new SimpleDateFormat(pattern).format(c.getTime());
	}
}
