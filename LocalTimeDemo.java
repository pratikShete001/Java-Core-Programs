import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo{
	public static void main(String args[])
	{
		//1. Current Time
		LocalTime now = LocalTime.now();
		System.out.println("Current Time: "+ now);
		
		// 2. Create Specific Time
		LocalTime time = LocalTime.of(10,30,45);
		System.out.println("Custom Time: "+ time);
		
		// 3. Get Hour, Minute, Second
		System.out.println("Hour: "+time.getHour());
		System.out.println("Minute: "+time.getMinute());
		System.out.println("Second: "+time.getSecond());
		
		// 4. Plus Methods
		System.out.println("Plus 2 Hours: "+time.plusHours(2));
		System.out.println("Plus 15 Minutes: "+time.plusMinutes(15));
		System.out.println("Plus 20 Seconds: "+time.plusSeconds(20));
		
		// 5. Minus Methods
		System.out.println("Minus 1 Hour: "+time.minusHours(1));
		System.out.println("Minus 10 Minutes: "+time.minusMinutes(10));
		System.out.println("Minus 30 Seconds"+time.minusSeconds(30));
		
		// 6. Change Values
		System.out.println("withHour(5)"+ time.withHour(5)); // Replace values 
		System.out.println("WithMinute(45)"+time.withMinute(45));
		System.out.println("withSecond(10): "+time.withSecond(10));
		
		// Comparison
		LocalTime t1 = LocalTime.of(8,0);
		LocalTime t2 = LocalTime.of(9,0);
		
		// Before After
		System.out.println("t1 before t2? "+t1.isBefore(t2));
		System.out.println("t1 after t2? "+t1.isAfter(t2));
		System.out.println("t1 equals t2? "+t1.equals(t2));
		
		// Formating
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formatted = time.format(formatter);
		System.out.println("Formatted Time: "+formatted);
		
		// 9. Parsing String to LocalTime
		LocalTime parsedTime = LocalTime.parse("18:45:30",formatter);
		System.out.println("Parsed Time: "+parsedTime);
		
		// 10. Constants
		System.out.println("Midnight: "+LocalTime.MIDNIGHT);
		System.out.println("Noon: "+LocalTime.NOON);
		
		//11. Nanoseconds
		System.out.println("Nano: "+ time.getNano());
		
		// 12. Convert to Seconds of Day
		System.out.println("Seconds of Day: "+time.toSecondOfDay());
	}
}