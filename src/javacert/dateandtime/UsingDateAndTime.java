package javacert.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2013, Month.JANUARY, 10);
		System.out.println(date);
		date = date.plusDays(5).plusMonths(2); //creates new date ... need to reassign variable
		System.out.println(date);
		
		LocalTime time = LocalTime.of(10,30);
		System.out.println(time);
		time = time.plusHours(2).plusMinutes(20);
		System.out.println(time);
		
		LocalDateTime localDateTime = LocalDateTime.of(date, time);
		System.out.println(localDateTime);
		localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
		System.out.println(localDateTime);
		
		//before java 8, date & calendar class
		Date myDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(myDate);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.MONTH, 2); //months start from 0 ...this is march
		myDate = calendar.getTime();
		System.out.println(myDate);
		
		//Exam tricks:
		LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
		ld.plusDays(10); //return result is ignored
		System.out.println(ld); //output is same as line 38 since 39 not doing anything
		
//		ld.plusMinutes(10); //wont compile ... date vs time...
		
		LocalTime lt = LocalTime.of(12, 45);
//		lt.addDays(5); //also wont compile
		
		
	}
}