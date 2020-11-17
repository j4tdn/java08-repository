package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// locale, timezone, UTC GMT
		// regular expression
		// regex pattern: Biểu thức chính quy
		System.out.println("def: " + Locale.getDefault());
		// da_DK: denmark formatted
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		System.out.println(nf.format(7));
		
		double number = 1123456789.7657d;
		DecimalFormat df = new DecimalFormat("#,###.000");
		System.out.println("formatted: " + df.format(number));
	}
}
