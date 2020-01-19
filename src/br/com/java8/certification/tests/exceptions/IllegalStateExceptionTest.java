package br.com.java8.certification.tests.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExceptionTest {

	public static void main(String[] args) {

		List<String> chord = new ArrayList<>();
		
		chord.add("D");
		chord.add("G");
		chord.add("B");
		chord.add("D");
		
		Iterator<String> it = chord.iterator();
		
		while (it.hasNext()) {
			it.next();
			it.remove();
			it.remove(); //IllegalStateException (remove depends on next)
		}
	
	}

}
