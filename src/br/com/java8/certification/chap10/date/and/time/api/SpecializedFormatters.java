package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class SpecializedFormatters {
	
	public static void main(String[] args) {
		
		String [] minutes = {"m", "mm"};
		String [] hours = {"h", "hh"};
		String [] days = {"d", "dd"};
		String [] months = {"M", "MM", "MMM", "MMMM", "MMMMM"};
		String [] years = {"Y", "YY", "YYYY"};
		String converts = "\u2192";
		
		LocalDateTime ldt = LocalDateTime.parse("2019-11-16T09:38:27");
		
		System.out.print("#hours:    ");
		Arrays.asList(hours).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + " ");
		});
		
		System.out.print("\n#minutes:  ");
		Arrays.asList(minutes).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + " ");
		});
		
		System.out.print("\n#months:   ");
		Arrays.asList(months).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + " ");
		});
		
		System.out.print("\n#days:     ");
		Arrays.asList(days).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + " ");
		});
		
		System.out.print("\n#years:    ");
		Arrays.asList(years).forEach(p -> {
			System.out.print(p + converts + ldt.format(DateTimeFormatter.ofPattern(p)) + " ");
		});
		
	}
}
