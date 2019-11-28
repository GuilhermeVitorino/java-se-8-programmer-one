package br.com.java8.certification.cap9.polimorphism;

//Chapter 9, page 290

class A {
	public void method() {
		System.out.println("a");
		method2(); //nesse caso o method2 acessado será o da classe B!!!
	}
	
	public void method2() {//nunca será chamado
		System.out.println("parent method2");
	}
}

class BSample1 extends A {
	public void method() {
		System.out.println("b");
		super.method();
	}
	
	public void method2() {
		System.out.println("c");
		method();
		super.method();
	}
	
	public static void main(String[] args) {
		new BSample1().method2();
	}
}


