package bean;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	private static final DateTimeFormatter DATE_PATIENT = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");
	public static void main(String[] args) {
		//getAllSundayInYear(2020);
		getLastSunday(2019);
	}

	private static void getAllSundayInYear(int year) {
		LocalDate sdate=LocalDate.of(year, 1, 1);
		LocalDate ldate=LocalDate.of(year+1,1 , 1);
		while(sdate.isBefore(ldate)) {
			if(sdate.getDayOfWeek()== DayOfWeek.SUNDAY) {				
				System.out.println(sdate.format(DATE_PATIENT));
			}
			sdate=sdate.plusDays(1);
		}
	}
	private static void getLastSunday(int year) {
		
		LocalDate ldate=LocalDate.of(year,12 ,31);
		while(ldate.getYear()==year) {
			if(ldate.getDayOfWeek()== DayOfWeek.SUNDAY) {				
				System.out.println(ldate.format(DATE_PATIENT));
				break;
			}
			ldate=ldate.minusDays(1);
		}
	}
}
