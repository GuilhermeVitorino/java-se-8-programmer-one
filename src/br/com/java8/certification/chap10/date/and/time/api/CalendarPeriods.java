package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalendarPeriods {

	final static Period P1 = Period.ofYears(1); // 1 year
	final static Period P2 = Period.ofMonths(12); // 1 year
	final static Period P3 = Period.ofWeeks(52); // 1 year
	final static Period P4 = Period.ofDays(366); // 1 year
	final static Period P5 = Period.of(1, 12, 366); // 3 years
		
	public static void main(String[] args) {
		
		//period of
		System.out.println("#period of[interval] methods:");
		
		LocalDate ldt1  = LocalDate.of(2000, Month.JANUARY, 1);
		LocalDate ldt2 = null;
		
		ldt2 = ldt1.plus(P1).plus(P2).plus(P3).plus(P4).plus(P5);

		System.out.println("before: " + ldt1 + " after: " + ldt2);
		
		
		
		//period parse
		System.out.println("\n#period parse[interval] methods:");
		
		//creates a period of 41 years, 2 months, and 3 days
		Period period_parse_1 = Period.parse("P41Y2M3D");
		System.out.println(period_parse_1);
		
		//creates a period of 4 weeks
		Period period_parse_2 = Period.parse("P4W");
		System.out.println(period_parse_2.getDays() + " days");
		
		
		
		//period get
		System.out.println("\n#period get[interval] methods:");
		
		Period period_get = Period.of(5, 1, 14);
		int years  = period_get.getYears();
		int months = period_get.getMonths();
		long days   = period_get.get(ChronoUnit.DAYS);
		
		System.out.println("years: " + years + ", months: " + months + ", days: " + days);
		
		
		
		//period with
		System.out.println("\n#period with[interval] methods:");
		
		Period period_with = Period.of(1, 1, 1); //1 year, 1 month, 1 day
		period_with = period_with.withYears(5); //Changes years only
		System.out.println(period_with);
		
		Period period_with2 = Period.of(1, 1, 1); //1 year, 1 month, 1 day
		period_with2 = period_with2.withMonths(5); //Changes months only
		System.out.println(period_with2);
		
		Period period_with3 = Period.of(1, 1, 1); //1 year, 1 month, 1 day
		period_with3 = period_with3.withDays(5); //Changes days only
		System.out.println(period_with3);
		
		
		
		//period plus
		System.out.println("\n#period plus[interval] methods:");
		
		Period period_plus = Period.of(5, 2, 1);
		
		period_plus = period_plus.plusYears(10);
		period_plus = period_plus.plusMonths(10);
		period_plus = period_plus.plusDays(15);
		period_plus = period_plus.plus(Period.ofDays(15));
		
		//plus a total 10 years, 10 month and 30 days
		System.out.println("period value: " + period_plus);
		
		
		
		//period minus
		System.out.println("\n#period minus[interval] methods:");
		
		Period period_minus = Period.of(15, 12, 31);
		
		period_minus = period_minus.minusYears(10);
		period_minus = period_minus.minusMonths(10);
		period_minus = period_minus.minusDays(15);
		period_minus = period_minus.minus(Period.ofDays(15));
		
		//minused a total 10 years, 10 month and 30 days
		System.out.println("period value: " + period_minus);
		
		
		
		//period is
		System.out.println("\n#period is[interval] methods:");
		
		Period period_is = Period.parse("P10D").minusDays(10);
		System.out.println(period_is.isZero());
		
		Period period_is2 = Period.parse("P2015M").minusMonths(2016);
		System.out.println(period_is2.isNegative());
				
		
		
		//period between
		System.out.println("\n#period between[interval] methods:");
		
		final String WAR_OF_1812_START_DATE = "1812-06-18";
		final String WAR_OF_1812_END_DATE = "1815-02-18"; 
		
		LocalDate warBegins = LocalDate.parse(WAR_OF_1812_START_DATE);
		LocalDate warEnds = LocalDate.parse(WAR_OF_1812_END_DATE);
		
		Period period_between = Period.between(warBegins, warEnds);
		System.out.println(period_between);
		
		//period normalized. ps: this method is not on the exam
		System.out.println("\n#period normalized:");
		
		Period period_normalized = Period.parse("P0Y13M");
		System.out.println("original: " + period_normalized + ", normalized: " + period_normalized.normalized());
		
		Period period_normalized2 = Period.parse("P3Y-1M");
		System.out.println("original: " + period_normalized2 + ", normalized: " + period_normalized2.normalized());
	}
}
