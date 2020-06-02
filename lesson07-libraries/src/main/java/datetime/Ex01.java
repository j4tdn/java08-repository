package datetime;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {

	public static void main(String[] args) {
		// lịch, getinstance tạo 1 thể hiện của calender
		System.out.println("time:   " +TimeZone.getDefault());
		System.out.println("locale:   " +Locale.getDefault(Locale.Category.FORMAT));
		
		Calendar c=Calendar.getInstance();
		GregorianCalendar g=new GregorianCalendar();
		
		System.out.println("calender"+c);
		System.out.println(""
				+ "Date:  "+c.get(Calendar.DAY_OF_MONTH)+"\n"
				+ "Month:  "+(c.get(Calendar.MONTH)+1)+"\n"// vì tính từ 0 đến 11 nên phải cộng thêm 1
				+ "Year:  "+c.get(Calendar.YEAR)+"\n"
				+ "Hours: "+c.get(Calendar.HOUR_OF_DAY)+"\n"// 24h
				+ "Minute: "+c.get(Calendar.MINUTE)+"\n"
				+ "Second:  "+c.get(Calendar.SECOND)+"\n"
						+ "Weekday:  "+c.get(Calendar.DAY_OF_WEEK)+"\n"
						+ "MonthDay1:  "+c.getActualMaximum(Calendar.DAY_OF_MONTH) +"\n"    //lấy xem ngày lớn nhất của tháng hiện tại
						+ "MonthDay2:  "+c.getMaximum(Calendar.DAY_OF_MONTH) +"\n" 
						+ "YearDay:  "+ c.getMaximum(Calendar.DAY_OF_YEAR)+"\n" 
						+ "isleapYear:  "+g.isLeapYear(c.get(Calendar.YEAR))
						+ ""
						+ ""
						+ ""
						+ "");
		c.set(Calendar.MONTH, 4);
		System.out.println(c.get(Calendar.MONTH));
		
	}
}
