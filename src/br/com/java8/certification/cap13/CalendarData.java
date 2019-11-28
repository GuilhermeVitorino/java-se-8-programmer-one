package br.com.java8.certification.cap13;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class CalendarData {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2013, 9, 7);
		d = d.plusWeeks(3).minus(4, ChronoUnit.WEEKS);
		System.out.println(d);
		
		System.out.println(YearMonth.now().toString());
		
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(YearMonth.now().isSupported(ChronoUnit.MONTHS));
		System.out.println();
		System.out.println(LocalDate.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(LocalDate.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println();
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println();
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
		System.out.println();
		Integer i1 = 123;
		Integer i2 = 123;
		System.out.println(i1 == i2);
		
	}
}
