package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {

		System.out.println("def: "+ Locale.getDefault());
		//da_DK: demark
		
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi" , "VN"));
		System.out.println(nf.format(7100));
		
		double number =123456789.7f;
				
		DecimalFormat df = new DecimalFormat("#.###,000");
		System.out.println("formatted: "+ df.format(number) );
		
		
	}
}
