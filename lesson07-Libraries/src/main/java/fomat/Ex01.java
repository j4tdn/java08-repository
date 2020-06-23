package fomat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("def : " + Locale.getDefault());
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("vi", "VN"));

		System.out.println(nf.format(7100));
		Double number = 1123456789.7d;
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("formatted : " + df.format(number));

	}
}
