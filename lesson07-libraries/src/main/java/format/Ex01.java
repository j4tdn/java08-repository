package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		// locale, timezone, UTC, GMT
		// regular expression
		// regex pattern: Biểu thức chính quy
		System.out.println("def: " + Locale.getDefault());
		// da_DK: denmark
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("da", "DK"));
		System.out.println(nf.format(71));
		
		double number = 1123456789.7d;
		DecimalFormat df = new DecimalFormat("#,###,000");
		System.out.println("Formatted: " + df.format(number));
	}

}
