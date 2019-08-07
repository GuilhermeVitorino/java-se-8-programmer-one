package br.com.cap9.thisandsuper.certification;

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
