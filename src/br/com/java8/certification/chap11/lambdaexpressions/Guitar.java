package br.com.java8.certification.chap11.lambdaexpressions;

public class Guitar {
	public static void main(String[] args) {
		Strummable instrument = () -> {System.out.println("strummed!");};
		instrument.strum();
	}
}

@FunctionalInterface
interface Strummable {
	void strum();
}
