package br.com.java8.certification.chap10.date.and.time.api;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
	
	public static void main(String[] args) {
		
		LocalDate ld1 =     LocalDate.now();
		System.out.println("LocalDate.now() -> " + ld1);
		
		LocalDate ld2 =     LocalDate.parse("2015-01-01"); //Date
		System.out.println("LocalDate.parse(\"2015-01-01\") -> " + ld2);
		
		LocalDate ld3 =     LocalDate.of(2015, 1, 1); //Year, Month, Day
		System.out.println("LocalDate.of(2015, 1, 1) -> " + ld3);
		
		LocalDate ld4 =     LocalDate.of(2015, Month.JANUARY, 1); //Year, Month, Day
		System.out.println("LocalDate.of(2015, Month.JANUARY, 1) -> " + ld4);
		
		LocalDate ld5 =     LocalDate.now(ZoneId.of("Asia/Tokyo")); //Locale
		System.out.println("LocalDate.now(ZoneId.of(\"Asia/Tokyo\")) -> " + ld5);
		
		LocalDate ld6 =     LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_DATE);
		System.out.println("LocalDate.parse(\"2015-01-01\", DateTimeFormatter.ISO_DATE) -> " + ld6);
		
		System.out.println(Instant.now());
		ZonedDateTime ld7 = ZonedDateTime.parse("2019-11-15T15:48:30.928018Z", DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.systemDefault()));
		System.out.println("LocalDate.parse(\"2019-11-15T15:48:30.928018Z\", DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.systemDefault())) -> " + ld7);
		
	}
}
