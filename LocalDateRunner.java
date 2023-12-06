package com.xworkz.builtinin;
import java.time.LocalDate;
import java.time.Month;

		public class LocalDateRunner {

			public static void main(String[] args) {
				System.out.println("Invoking main in LocalDateRunner");
				LocalDate today = LocalDate.now();
		        LocalDate specificDate = LocalDate.of(2023, Month.AUGUST, 22);
		        LocalDate parsedDate = LocalDate.parse("2023-08-22");

		        // Getting parts of the date
		        int year = today.getYear();
		        Month month = today.getMonth();
		        int dayOfMonth = today.getDayOfMonth();
		        int dayOfWeekValue = today.getDayOfWeek().getValue(); // 1 (Monday) to 7 (Sunday)
		        String dayOfWeekName = today.getDayOfWeek().name();   // MONDAY

		        System.out.println("Year: " + year);
		        System.out.println("Month: " + month);
		        System.out.println("Day of Month: " + dayOfMonth);
		        System.out.println("Day of Week Value: " + dayOfWeekValue);
		        System.out.println("Day of Week Name: " + dayOfWeekName);

		        // Comparisons
		        boolean isBefore = today.isBefore(specificDate);
		        boolean isAfter = today.isAfter(specificDate);
		        boolean isEqual = today.isEqual(parsedDate);
		        System.out.println("Is before? " + isBefore);
		        System.out.println("Is after? " + isAfter);
		        System.out.println("Is equal? " + isEqual);

		        // Adding and subtracting days
		        LocalDate futureDate = today.plusDays(7);
		        LocalDate pastDate = today.minusDays(3);
		        System.out.println("Future Date: " + futureDate);
		        System.out.println("Past Date: " + pastDate);

		      
			}

		}

	}

}
