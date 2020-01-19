package br.com.java8.certification.tests.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
	
	/*Error in RuntimeException catch.
	Unreachable catch block for RuntimeException. It is already handled by the catch block for Exception*/
	
	public static void main(String[] args) {
		try {

			BufferedReader br = new BufferedReader(new FileReader
                    ("/tmp/arquivoInexistente"));
			 System.out.println(br);;
			 
		} catch (RuntimeException | IOException e) {
			e.printStackTrace();
		}
		/*catch (RuntimeException e) {
			// TODO: handle exception
		}*/
	}
}
