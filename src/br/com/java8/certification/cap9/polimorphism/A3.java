package br.com.cap9.polimorphism.certification;

//Chapter 9, page 296 - 297

import java.io.*;

class B {
	void x(int i) throws IOException {
		if (++i < 0)
			return;
		x(-1);
		System.out.println("c");
	}
}

abstract class C extends B {
	void x(int i) throws IOException {
		System.out.println("b");
		super.x(i);
	}
}

abstract class D extends C {
	void x(int i) throws IOException {
 		super.x(i);
	}
}

class E extends D {
}

class A3 {
	public static void main(String[] args) throws IOException {
		new E().x(32);
	}
}
