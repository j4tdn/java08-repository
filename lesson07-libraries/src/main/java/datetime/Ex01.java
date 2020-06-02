package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	public static void main(String[] args) {
		
		GregorianCalendar g=new GregorianCalendar();
		Calendar calendar=Calendar.getInstance();//lay ngay thang nam hien tai
		
		calendar.set(Calendar.MONTH,4);
		
		System.out.println("Timezone default "+TimeZone.getDefault() );
		System.out.println("Local default "+Locale.getDefault(Locale.Category.FORMAT));
		System.out.println("calendar"+calendar);
		System.out.println(""
					+"Day: "+calendar.get(Calendar.DAY_OF_MONTH)+"\n"
		            +"Month: "+(calendar.get(Calendar.MONTH)+1)  +"\n"
		            +"Year: "+calendar.get(Calendar.YEAR) +"\n"
		            +"Hour 12:"+calendar.get(Calendar.HOUR) +"\n"
		            +"Hour 24:"+calendar.get(Calendar.HOUR_OF_DAY) +"\n"
		            +"Minute: "+calendar.get(Calendar.MINUTE) +"\n"
		            +"Second: "+calendar.get(Calendar.SECOND)+"\n"
		            +"WeekDay: "+calendar.get(Calendar.DAY_OF_WEEK)+"\n"
		            +"MonthDay: "+calendar.getActualMaximum(Calendar.DAY_OF_MONTH)+"\n"
					+"YearDay: "+calendar.getActualMaximum(Calendar.DAY_OF_YEAR)+"\n"
					+"IsLeapYear: "+g.isLeapYear(calendar.get(Calendar.YEAR))+"\n"
					);
		
	}
}
