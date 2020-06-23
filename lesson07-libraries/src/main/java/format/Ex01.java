package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("def: " + Locale.getDefault());
		// NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
		//da: demmark formatted
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("da", "DK"));
		System.out.println("a: " + nf.format(7100));

		double number = 123456789.7d;
		DecimalFormat df = new DecimalFormat("#,###.000");
		System.out.println("number: " + df.format(number));
		
	}
}
