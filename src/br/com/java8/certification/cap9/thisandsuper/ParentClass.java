package br.com.java8.certification.cap9.thisandsuper;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("ParentClass Constructor");
	}
	
	public ParentClass(String s) {
		System.out.println("ParentClass Constructor " + s);
	}
	
	public static void main(String[] args) {
		
		ChildClass cc1 = new ChildClass();
		ChildClass cc2 = new ChildClass("test");
		
	}
}

class ChildClass extends ParentClass {
	
	public ChildClass() {
		System.out.println("ChildClass Constructor");
	}
	
	public ChildClass(String s) {
		super(s);
		System.out.println("ChildClass Constructor " + s);
	}
}