package br.com.java8.certification.tests.access.modifier.shape.triangle;

import br.com.java8.certification.tests.access.modifier.shape.*;

public class Triangle extends Shape {
	
	public void printSide() {
		
		System.out.println("side = " + side );
		
		//System.out.println("side = " + ((Shape) this).side ); error, because Shape modifier access is protected

	}
}
