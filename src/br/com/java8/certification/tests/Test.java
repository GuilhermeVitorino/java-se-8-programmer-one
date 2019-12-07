package br.com.java8.certification.tests;

public class Test {

	static char c = '\u03A9'; //entre aspas simples representa um único caraceter
	static String $srtIdentificador = "$teste";
	static long lng = 10L;
	static float flt = -36000.0f;
	
	public static void main(String[] args) {
		
		int v9 = 144___21_12; //ok
		//int v8 = _123; nok
		//float flt_ = 111_.0f; nok
		//float flt_ = 111._0f; nok
		//float flt_ = 111.0_f; nok
				
		System.out.println(c);
		System.out.println($srtIdentificador);
		System.out.println(lng);
		System.out.println(flt);
		
		float intToFloat = 10;
		int floatToInt = (int) 10.9F;
		
		float sumFloatInt = intToFloat + floatToInt;
		
		System.out.println("intToFloat: " + intToFloat);
		System.out.println("floatToInt: " + floatToInt);
		System.out.println("sumFloatInt: " + sumFloatInt);
		
	}
	
}
