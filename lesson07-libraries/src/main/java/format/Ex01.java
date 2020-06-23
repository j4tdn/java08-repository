package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		
		// Timezone, Locale 
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

		System.out.println(nf.format(Math.pow(10, 7)));
		System.out.println(nf.format(1000000));
		
		long number = 123456789;
		double b = 102355.11564d;
		DecimalFormat df = new DecimalFormat("# ###.00");
		System.out.println("formatted" + df.format(number));
		System.out.println(df.format(b));
	}
}
