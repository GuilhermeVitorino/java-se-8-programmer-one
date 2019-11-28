package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.format.DateTimeFormatter.*;

public class LocalizedFormatters {

		public static void main(String[] args) {
			
			//localized formatters with LocalDate class
			System.out.println("#localized formatters with LocalDate class:");
			
			LocalDate ld = LocalDate.now();
			System.out.println("result 1: " + ld.format(DateTimeFormatter.ISO_WEEK_DATE));
			System.out.println("result 2: " + ld.format(ISO_WEEK_DATE));
			
			
			
			//localized formatters with OffsetDateTime class
			System.out.println("\n#localized formatters with OffsetDateTime class:");
			
			OffsetDateTime odt = OffsetDateTime.now();
			System.out.println(odt.format(ISO_DATE));
			System.out.println(odt.format(ISO_OFFSET_DATE));
			System.out.println(odt.format(ISO_OFFSET_DATE_TIME));
			
			
			
			//localized formatters with ZonedDateTime class
			System.out.println("\n#localized formatters with ZonedDateTime class:");
			
			ZonedDateTime zdt = ZonedDateTime.now();
			System.out.println(zdt.format(ISO_DATE_TIME));
			System.out.println(zdt.format(ISO_ZONED_DATE_TIME));
			System.out.println(zdt.format(DateTimeFormatter.RFC_1123_DATE_TIME));
			
			
			
			//passing Formatter to LocalDate format method
			System.out.println("\n#passing Formatter to LocalDate format method:");
			
			LocalDate ld2 = LocalDate.now();
			System.out.println("SHORT:  " + ld2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
			System.out.println("MEDIUM: " + ld2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			System.out.println("LONG:   " + ld2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
			System.out.println("FULL:   " + ld2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
			
			
			
			//passing Formatter to LocalTime format method
			System.out.println("\n#passing Formatter to LocalTime format method: ");
			
			LocalTime lt = LocalTime.now();
			System.out.println("SHORT: " + lt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
			System.out.println("MEDIUM: " + lt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
			
			
			
			//passing LocalTime instance to Formatter's format method
			System.out.println("\n#passing LocalTime instance to Formatter's format method: ");
			System.out.println("SHORT: " + DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(lt));
			System.out.println("MEDIUM: " + DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(lt));
			
			
			
			//passing Formatter to LocalDate format method
			System.out.println("\n#passing Formatter to LocalDateTime format method:");
			
			LocalDateTime ldt = LocalDateTime.now();
			System.out.println("datetime: " + ldt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
			System.out.println("date: " + ldt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
			System.out.println("time: " + ldt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
						
		}
}
