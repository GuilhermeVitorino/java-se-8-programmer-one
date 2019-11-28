package br.com.java8.certification.tests;

public class HelloWorld {

	static int a = 15; //prints 15
	static int b = getMethod();
	//static int a = 15;// prints 0
	
	public static int getMethod() {
		return a;
	}

	public static void main(String[] args) {
		System.out.println(b);
	}
}
