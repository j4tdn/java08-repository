package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		// regex pattern : bieu thuc chinh quy
		System.out.println("def:" + Locale.getDefault());
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		System.out.println(nf.format(7100));
		
		
		double number =  123456789.7d;
		DecimalFormat df = new DecimalFormat("#,###.#");
		System.out.println("formatted:"  +df.format(number));
		
		
		
	}

}
