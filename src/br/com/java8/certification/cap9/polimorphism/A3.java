package br.com.java8.certification.cap9.polimorphism;

//Chapter 9, page 296 - 297

import java.io.*;

class B {
	void x(int i) throws IOException {
		if (++i < 0)
			return;
		x(-1); //call E class method
		System.out.println("B class");
	}
}

abstract class C extends B {
	void x(int i) throws IOException {
		System.out.println("C class");
		super.x(i);
	}
}

abstract class D extends C {
	void x(int i) throws IOException {
		System.out.println("D class");
 		super.x(i);
	}
}

class E extends D {
	void x(int i) throws IOException {
		System.out.println("E class");
		super.x(i);
	}
}

class A3 {
	public static void main(String[] args) throws IOException {
		new E().x(32);
	}
}
