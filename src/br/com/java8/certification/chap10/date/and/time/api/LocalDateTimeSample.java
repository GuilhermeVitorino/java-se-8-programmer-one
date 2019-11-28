package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSample {
	
	public static void main(String[] args) {
		
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println( "LocalDateTime.now() -> " + ldt1);
		
		LocalDateTime ldt2 = LocalDateTime.parse("2015-01-01T12:00:00");
		System.out.println( "LocalDateTime.parse(\"2015-01-01T12:00:00\") -> " + ldt2);
		
		LocalDateTime ldt3 = LocalDateTime.of(2015, 1, 1, 12, 0);
		System.out.println( "LocalDateTime.of(2015, 1, 1, 12, 0) -> " + ldt3);
		
		LocalDateTime ldt4 = LocalDateTime.of(2015, Month.JANUARY, 1, 12, 0);
		System.out.println( "LocalDateTime.of(2015, Month.JANUARY, 1, 12, 0) -> " + ldt4);
		
		LocalDateTime ldt5 = LocalDateTime.of(2015, 1, 1, 12, 0, 1);
		System.out.println( "LocalDateTime.of(2015, 1, 1, 12, 0, 1) -> " + ldt5);
		
		LocalDateTime ldt6 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println( "LocalDateTime.now(ZoneId.of(\"Asia/Tokyo\") -> " + ldt6);
		
		LocalDateTime ldt7 = LocalDateTime.parse("2015-01-01 12:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		System.out.println( "LocalDateTime.parse(\"2015-01-01 12:00\", DateTimeFormatter.ofPattern(\"yyyy-MM-dd HH:mm\") -> " + ldt7);
	}
}
