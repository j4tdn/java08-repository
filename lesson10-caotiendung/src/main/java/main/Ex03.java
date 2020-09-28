package main;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {"-2","-6","10",null,"4","8",null,"Special","a","c","b","xx"};
		
		Arrays.sort(strings,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) {
					return o2 == null ? -1 : 0;
				}

				if (o2 == null) {
					return -1;
				}

				if (o2.equals("Special")) {
					 return o1.equals("Special") ? 0 : 1;
				}

				if (o1.equals("Special")) {
					return -1;
				}

				try {
					int n1 = Integer.parseInt(o1);
					int n2 = Integer.parseInt(o2);
					return n1 - n2;
				} catch (NumberFormatException ex) {
				}

				return o1.compareTo(o2);
			}
		});
		
		Arrays.stream(strings).forEach(str ->System.out.println(str));
	}
}
