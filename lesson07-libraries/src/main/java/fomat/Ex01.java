package fomat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class Ex01 {
	public static void main(String[] args) {
		// regex pattern:biểu thức chính quy
		// regular expession

		System.out.println("def: " + Locale.getDefault());

		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vl", "VN"));
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("vl", "VN"));
		NumberFormat nf2 = NumberFormat.getPercentInstance();// không dùng

		System.out.println(nf.format(7.5f));
		System.out.println(nf1.format(7500));
		System.out.println(nf2.format(75));

		double number = 1123456789.7d;
		DecimalFormat df = new DecimalFormat(" #,###.000");

		System.out.println("fomatted:   " + df.format(number));

		// gmt, utc ,locale,timezone là cái gì
	}
}
