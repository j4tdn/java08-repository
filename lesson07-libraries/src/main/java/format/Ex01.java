package format;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		//Locale, Timezone, UTC, JMT
		System.out.println("def: " + Locale.getDefault());
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
		
		System.out.println(nf.format(Math.pow(10, 7)));

	}

}
