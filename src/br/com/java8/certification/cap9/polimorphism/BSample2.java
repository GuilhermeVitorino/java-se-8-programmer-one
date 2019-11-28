package br.com.java8.certification.cap9.polimorphism;

//Chapter 9, page 291

class A2 {
	public void method() {
		System.out.println("a");
		this.method2(); //nesse caso o method2 acessado será o da classe B!!!
						//nem com o this seŕa acessado o da classe A
	}
	
	public void method2() {//nunca será chamado
		System.out.println("parent method2");
	}
}

class BSample2 extends A2 {
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
		new BSample2().method2();
	}
}


