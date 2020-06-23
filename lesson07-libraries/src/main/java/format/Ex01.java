package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		
		//locale , timezone , UTC, GMT 
		// regular expression : bieu thuc chinh quy ;
		
		// regex pattern ;
		
		System.out.println("def : " +Locale.getDefault() );
		
		
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi","VN"));
		
		NumberFormat nfMoney = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
		
		float floatNumber = 12345.7f;
		
		
		long number = 123456789 ;
		
		DecimalFormat df  = new DecimalFormat("#,###.000");
		System.out.println("formatted"+df.format(floatNumber));
		
		
		System.out.println("money " + nfMoney.format(710000));
		
		System.out.println(nf.format(7.5f));
	}
}
