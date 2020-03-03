package javacert.dateandtime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2010, Month.APRIL, 5);
		LocalTime time = LocalTime.of(11, 22, 33);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		//3 diff formatters
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		System.out.println(shortFormatter.format(dateTime)); //short has just 2 numbers for year
		System.out.println(mediumFormatter.format(date)); //4 numbers for year
//		System.out.println(shortFormatter.format(time)); //unsupported Temporal Type Exception at runtime
		//ie, cant format a time with a date formatter
		
		//more Ms --> more verbose the output (4-->04-->Apr-->April)
		//same deal w ds, ys, hs
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(formatter));
		
		//before java 8,
		SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
		System.out.println(sf.format(new Date()));
		
		//tricks
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf.format(dateTime)); //ok
//		System.out.println(dtf.format(date)); //throws runtime exception ... formatter is for just time
		System.out.println(dtf.format(time)); //ok
	}
}
