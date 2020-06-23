package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//local, timezone, UTC, GMT
		//regular expression
		//regex pattern: bieu thuc chinh quy (ngon ngu rieng dich ra ngay thang nam ...?)
		System.out.println("default: " + Locale.getDefault());
		
		//da: DK: demark: Dan Mach
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi", "VN")); 
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); 
		NumberFormat nf2 = NumberFormat.getPercentInstance(new Locale("vi", "VN")); 
		System.out.println("number: " + nf.format(7.5f));
		System.out.println("tien te: " + nf1.format(7100));
		System.out.println("%: " + nf2.format(0.7));
		
		//float number = 1234567899.7f;
		double number = 1234567899.7d;
		
		DecimalFormat df = new DecimalFormat("#, ###.00");//phan nguye nen de #, thap phan 0
		System.out.println("so thap phan formated: " + df.format(number));
	}
}
