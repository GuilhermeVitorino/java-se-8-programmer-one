package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalDate;

public class LocalDateManipulation {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		
		//all plus methods (4). plus about 4 years
		ld = ld.plusYears(1).plusMonths(12).plusWeeks(52).plusDays(365);
			System.out.println(ld.toString());
		
		//all minus methods (4). minused about 4 years
		ld = ld.minusYears(1).minusMonths(12).minusWeeks(52).minusDays(365);
		System.out.println(ld.toString());
		
	}

}
