package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("def: "+Locale.getDefault());
		//NumberFormat nf=NumberFormat.getNumberInstance(new Locale("vi","VN"));
		//double a=12345*3489;
		//System.out.println("a: "+nf.format(a));
		
		NumberFormat nf=NumberFormat.getCurrencyInstance(new Locale("en","US"));
		System.out.println("a: "+nf.format(7632));
		
		double number=123456789.7;
		DecimalFormat df=new DecimalFormat("#,###.000");
		System.out.println("formatted: "+df.format(number));
		
		

	}

}
