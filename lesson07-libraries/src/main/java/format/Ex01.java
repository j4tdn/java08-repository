package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// TimeZone, Locale, UTC, GMT
		// regular expression
		// regex pattern: Bieu thuc chinh quy
		System.out.println("def: " + Locale.getDefault());
		
		// da_DK: demark
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi", "VN"));		
		System.out.println(nf.format(7.5));
		// money unit
		NumberFormat ncf = NumberFormat.getCurrencyInstance(new Locale("da", "DK"));	
		System.out.println(ncf.format(7100));
		
		// format phan thap phan
		double number = 123456789.7d;
		DecimalFormat df = new DecimalFormat("#,###.###");
		System.out.println("formatted: " + df.format(number));
	}
}
