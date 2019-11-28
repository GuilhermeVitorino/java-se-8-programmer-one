package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalDateTime;

public class LocalDateTimeManipulation {
	
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		//all plus methods (8). plus about 6 years
		ldt = ldt.plusYears(1).plusMonths(12).plusWeeks(52).plusDays(365)
			.plusHours(8765).plusMinutes(525949).plusSeconds(0).plusNanos(0);
		
		System.out.println(ldt.toString());
		
		//all minus methods (8). minused about 6 years
		ldt = ldt.minusYears(1).minusMonths(12).minusWeeks(52).minusDays(365)
				.minusHours(8765).minusMinutes(525949).minusSeconds(0).minusNanos(0);
			
			System.out.println(ldt.toString());
			
	}
}
