package Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import util.*;



public class App {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		
		System.out.println("Moi ban nhap vao ngay bat dau hen ho : dd/MM/yyyy");
		
		String date = sc.nextLine();
		
		Calendar start = null ;
		
		try {
			 start = DateUtils.toCalendar(date, "dd/MM/yyyy");
			
			System.out.println("holeleleel " +df.format(start.getTime()));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		LocalDate ldstart = LocalDate.now().of(start.get(Calendar.YEAR), start.get(Calendar.MONTH)+1, start.get(Calendar.DAY_OF_MONTH));
		
		
		LocalTime ltstart = LocalTime.now().of(start.get(Calendar.HOUR), start.get(Calendar.MINUTE), start.get(Calendar.SECOND));
		
		
		
		
		LocalDateTime dtstart = LocalDateTime.of(ldstart, ltstart);
		
		
		
		
		
		
		System.out.println("Mời bạn nhập vào thời gian chia tay , nếu chưa chia tay thì nhập 'chua'  ");
		
		String end = new Scanner(System.in).nextLine();
		
		LocalDateTime dtEnd ; 
		
		
		if(end.equals("chua")) {
			
			dtEnd = LocalDateTime.now();
			
		}
		
		else {
			
			Calendar cEnd =null;
			try {
				cEnd = DateUtils.toCalendar(end, "dd/MM/yyyy");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			LocalDate ldEnd = LocalDate.now().of(cEnd.get(Calendar.YEAR), cEnd.get(Calendar.MONTH)+1, cEnd.get(Calendar.DAY_OF_MONTH));
			
			LocalTime ltEnd = LocalTime.now().of(cEnd.get(Calendar.HOUR), cEnd.get(Calendar.MINUTE), cEnd.get(Calendar.SECOND));
			
			
			dtEnd = LocalDateTime.now().of( ldEnd, ltEnd);
			
		}
		
		
		
		
		
		
		
		
		
		LocalDate ldateStart = dtstart.toLocalDate();
		LocalDate ldateEnd = dtEnd.toLocalDate();
		
		LocalTime ltimeStart = dtstart.toLocalTime();
		LocalTime ltimeEnd = dtEnd.toLocalTime();
		
		if(dtstart.isAfter(dtEnd)) {
			throw new RuntimeException("start date should not greater than end date");
		}
		
		
		// Period  support day, month , year ;
		
		Period period = Period.between(ldateStart, ldateEnd);
		
		// duration support hour, minutes, seconds 
		
		Duration dr = Duration.between(ltimeStart, ltimeEnd);
		
		long durationAtSeconds = dr.getSeconds();
		
		if(durationAtSeconds < 0) {
			period = period.minusDays(1);
			
			if(period.getDays() < 0) {
				period = period.minusMonths(1);
				
				int daysOfMonth = YearMonth.of(ldateStart.getYear(), ldateStart.getMonth()).lengthOfMonth();
				
				period = period.withDays(daysOfMonth-1);
							
			}
			
			durationAtSeconds += TimeUnit.DAYS.toSeconds(1);
		}
		
		
		
		long hours = TimeUnit.SECONDS.toHours(durationAtSeconds);
		
		long remainingMinutes = durationAtSeconds - TimeUnit.HOURS.toSeconds(hours);
		
		long minutes = TimeUnit.SECONDS.toMinutes(remainingMinutes);
		
		long seconds = remainingMinutes - TimeUnit.MINUTES.toSeconds(minutes);
		
		
		
		System.out.println("Period " + period);
		
		System.out.println("years : " + period.getYears());
		System.out.println("month "+ period.getMonths());
		System.out.println("days :" + period.getDays());
		System.out.println("hour : " +hours);
		System.out.println("minutes" +minutes);
		System.out.println("seconds " + seconds);
	}
}
