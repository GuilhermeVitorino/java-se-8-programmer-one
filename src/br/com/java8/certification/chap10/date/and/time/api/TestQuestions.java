package br.com.java8.certification.chap10.date.and.time.api;

import java.time.Period;

public class TestQuestions {
	public static void main(String[] args) {
		
		Period p = Period.parse("P1Y");
		System.out.println(p.getMonths());
		
		
	}
}
