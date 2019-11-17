package br.com.java8.certification.chap11.lambdaexpressions;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		
		Predicate<Integer> lowerThanAhundred = (a) -> a <= 100;
		System.out.println("Is 90 lower than or equal to 100?: "  + lowerThanAhundred.test(90));
		System.out.println("Is 110 lower than or equal to 100?: " + lowerThanAhundred.test(110));
		
		System.out.println("\nIs 110 lower than or equal to 100, and lower than or equal to 120?: " + lowerThanAhundred.and((a) -> a <= 120).test(110));
		System.out.println("Is 100 lower than or equal to 100, and lower than or equal to 120?: " + lowerThanAhundred.and((a) -> a < 120).test(100));
		
		System.out.println("\nIs 110 lower than or equal to 100, or lower than or equal to 120?: " + lowerThanAhundred.or((a) -> a <= 120).test(110));
		System.out.println("Is 100 lower than or equal to 100, or lower than or equal to 120?: " + lowerThanAhundred.or((a) -> a < 120).test(100));
		
		System.out.println("NEGATE! - Is 90 lower than or equal to 100?: "  + lowerThanAhundred.negate().test(90));
	}
}
