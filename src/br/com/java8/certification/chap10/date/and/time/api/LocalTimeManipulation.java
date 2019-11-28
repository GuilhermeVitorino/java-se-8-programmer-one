package br.com.java8.certification.chap10.date.and.time.api;

import java.time.LocalTime;

public class LocalTimeManipulation {

	public static void main(String[] args) {

		LocalTime lt = LocalTime.now();

		// all plus methods (4)
		lt = lt.plusHours(18765).plusMinutes(525949).plusSeconds(0).plusNanos(0);

		System.out.println(lt.toString());

		// all minus methods (4)
		lt = lt.minusHours(1).minusMinutes(1).minusSeconds(1).minusNanos(1);

		System.out.println(lt.toString());
	}
}
