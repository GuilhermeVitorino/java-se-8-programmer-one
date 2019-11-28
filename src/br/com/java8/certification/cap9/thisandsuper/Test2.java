package br.com.java8.certification.cap9.thisandsuper;

class B {
	B() {
		
	}
	
	B(String s) {
		this();
		System.out.println(s+1);
	}
}

public class Test2 {
	public static void main(String[] args) {
		String s = null;
		B b = new B(null);
	}
}
