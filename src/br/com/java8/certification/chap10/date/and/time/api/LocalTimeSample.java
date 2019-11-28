package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeSample {
	
	public static void main(String[] args) {
		
		LocalTime lt1  = LocalTime.now();
		System.out.println("LocalTime.now() -> " + lt1);
		
		LocalTime lt2  = LocalTime.parse("13:00"); //Hour
		System.out.println("LocalTime.parse(\"11:49\") -> " + lt2);
		
		LocalTime lt3  = LocalTime.of(11, 49); //Hour, minutes
		System.out.println("LocalTime.of(11, 49) -> " + lt3);
		
		LocalTime lt4  = LocalTime.of(11, 59, 01); //Hour, minutes, seconds
		System.out.println("LocalTime.of(11, 59, 01) -> " + lt4);
		
		LocalTime lt5  = LocalTime.NOON; //MIN, MAX, MIDNIGHT as well
		System.out.println("LocalTime.NOON -> " + lt5);
		
		LocalTime lt6  = LocalTime.of(12, 0, 0, 1); //Hour, minutes, seconds, nanos
		System.out.println("LocalTime.of(12, 0, 0, 1) -> " + lt6);
		
		LocalTime lt7  = LocalTime.now(ZoneId.of("Asia/Tokyo")); //Locale
		System.out.println("LocalTime.now(ZoneId.of(\"Asia/Tokyo\") -> " + lt7);
		
		LocalTime lt8  = LocalTime.parse("12:00", DateTimeFormatter.ISO_TIME);
		System.out.println("LocalTime.parse(\"12:00\", DateTimeFormatter.ISO_TIME) -> " + lt8);
	}
}
