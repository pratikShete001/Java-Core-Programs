import java.time.LocalDate;

public class LocalDateClass{
	public static void main(String args[])
	{
		LocalDate today = LocalDate.now();
		System.out.println("Today's Date: "+today);
		
		LocalDate birthDate = LocalDate.of(2005,7,20);
		System.out.println("Birth Date: "+birthDate);
		
		System.out.println("Year: " + birthDate.getYear());
		System.out.println("Month: " + birthDate.getMonth());
		System.out.println("Day: " + birthDate.getDayOfMonth());
		
		// Add Days
		LocalDate after10Days = today.plusDays(10);
		System.out.println("After 10 Days: " + after10Days);
		
		LocalDate before2month = today.minusMonths(2);
		System.out.println("Before 2 Days: " + before2month);
		
		LocalDate before3years = today.minusYears(3);
		System.out.println("Before 3 Years: " + before3years);
		
        System.out.println("Is Leap Year? " + today.isLeapYear());
		
		//7. Compare Dates
		if (birthDate.isBefore(today)) {
            System.out.println("Birth date is before today");
        }

        // 8. Check Equality
        if (today.equals(LocalDate.now())) {
            System.out.println("Dates are equal");
        }

		
	}
}