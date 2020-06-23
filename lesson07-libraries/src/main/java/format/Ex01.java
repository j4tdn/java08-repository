package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		// Cac quoc gia khac ngan 3 so bang , dung locate trong getNumberInstance();
//		Locale.getAvailableLocales()
		// Locale la gi , timezone
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi", "Vn"));

		System.out.println(nf.format(Math.pow(10, 7)));
		System.out.println(nf.format(7.5f));

		nf = NumberFormat.getCurrencyInstance(new Locale("vi", "Vn"));
		System.out.println(nf.format(71000));

		double number = 1123456789.7d;

		DecimalFormat df = new DecimalFormat("#,###.000");
		System.out.println("formatted : " + df.format(number));

//		nf = NumberFormat.getPercentInstance(new Locale("vi", "Vn"));
//		System.out.println(nf.format(71));

	}

}
