package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("def: "+Locale.getDefault());
		//da_DK, locale laf gim timezone laf fi UTC, GMT laf gi
		
		NumberFormat nf = //NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
				NumberFormat.getCurrencyInstance(new Locale("da","DK"));
				//NumberFormat.getPercentInstance(new Locale("en","US"));
		System.out.println(nf.format(Math.pow(10, 7)));
		
		double b= 1163456715.7f;
		DecimalFormat df= new DecimalFormat("#,###.000");
		System.out.println("formatted decimal: "+df.format(b));
		
		
	}
}
