package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi","VN"));
		System.out.println(nf.format(Math.pow(10, 7)));
		
		DecimalFormat df = new DecimalFormat("#,###,###.##");
		
		System.out.println("df: " + df.format(123456.789f));
	}

}
