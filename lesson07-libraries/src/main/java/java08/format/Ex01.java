package java08.format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        //Locale, Timezone, GTM, UTC
        System.out.println("def: " + Locale.getDefault());

        NumberFormat nf = NumberFormat.getPercentInstance(new Locale("da", "DK"));

        System.out.println(nf.format(1000000));

        double number = 123456789.7d;
        DecimalFormat df = new DecimalFormat("#,###.000");
        System.out.println("formatted: " + df.format(number));
    }
}
