package javacert.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime {

	//first thing to decide: how much info do you need
	//3 choices/classes can use (in java 8):
//		-local date
//		-local time
//		-local datetime
	//all these classes are immutable! ...need to dereference vars if changing the date
	//these classes are new in java 8
	
	public static void main(String[] args) {
		System.out.println(LocalDate.now()); 
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 1); //Month is special class (enum class)
		
		LocalTime localTime = LocalTime.of(10, 30);
		
		System.out.println(localDate);
		System.out.println(localTime);
		
		//note: these are overloaded methods
		System.out.println(LocalDateTime.of(localDate, localTime));
		
		//before java 8:
		System.out.println(new Date());
	
		Calendar calendar = Calendar.getInstance();
		calendar.set(2015, Calendar.JANUARY, 1);
		Date january = calendar.getTime();
		System.out.println(january);
	}
	
}
