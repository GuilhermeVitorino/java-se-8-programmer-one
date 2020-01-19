package br.com.java8.certification.tests.exceptions;

import java.awt.print.PageFormat;

public class IllegalArgumentExceptionTest {
	public static void main(String[] args) {
		PageFormat path = new PageFormat();
		path.setOrientation(3);
	}
}
