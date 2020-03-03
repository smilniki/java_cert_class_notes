package javacert.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {
	//meaning: string-->date/time
	
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("02 15 2010", formatter);
		LocalTime time = LocalTime.parse("11:33");
		
		//not what we expect bc date and time aren't strings...
		System.out.println(date); //2010-02-15
		System.out.println(time);
		
		String text = date.format(formatter);
		System.out.println(text); //now its in the format we declared
		
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println(parsedDate); //2010-02-15 //same deal as line 16
		
		LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
		String dateString = formatter.format(myDate);
		System.out.println(dateString);
		
		LocalDate anotherDate = LocalDate.parse(dateString, formatter);
		anotherDate.plusMonths(5).plusDays(5); //this has no effect
		System.out.println(formatter.format(anotherDate));
	}
}
