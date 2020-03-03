package javacert.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriods {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
		cleanAnimalCage(start, end);
		
		//problem w this: what is want to clean the cage, say, every week instead?
		
		start.toEpochDay(); //returns a long ... number of days since jan 1st 1970
		Period period = Period.ofWeeks(1); //since want every week
		
		System.out.println(start.plus(period));
		System.out.println(LocalDateTime.now().plus(period));
//		System.out.println(LocalTime.now().plus(period)); //throws runtime exception bc time doesnt have days/months/weeks
		//^ UnsupportedTemporalTypeException
		
		Period yearAndMonth = Period.ofYears(1).ofMonths(1);
		System.out.println(yearAndMonth); //only prints month 1 bc cant chain methods on Period class
		// if you chain months on period class, only last method (since static) will return new period
		
		//fix
		Period yearAndMonth2 = Period.of(1, 1, 0);
		System.out.println(yearAndMonth2);
		
		//using new method
		cleanAnimalCage(start, end, period); //prints all dates w diff of 1 week
		
	}
	
	//fix ... nicer method easier to reuse
	public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
		while (start.isBefore(end)) {
			System.out.println("Need to clean the cage on date= "+start);
			start = start.plus(period);
		}
	}
	
	public static void cleanAnimalCage(LocalDate start, LocalDate end) {
		while (start.isBefore(end)) {
			System.out.println("Need to clean the cage on date= "+start);
			start = start.plusMonths(1);
		}
	}
}
