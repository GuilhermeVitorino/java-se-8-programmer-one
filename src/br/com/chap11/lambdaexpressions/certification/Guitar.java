package br.com.chap11.lambdaexpressions.certification;

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
