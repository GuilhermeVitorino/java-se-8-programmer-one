package br.com.java8.certification.strings;

public class StringBuilderTests {
	
	public static void main(String[] str) {
		//append method
		StringBuilder strb = new StringBuilder("Shiver Me Timbers!");
		strb.append(", ok?xpto", 0, 5); // 0 and 5 is like a substring...
		System.out.println(strb);
		
		strb.append(new char[]{'*','n','o','k', '?'}, 0, 1);
		System.out.println(strb);
		
		strb.append(new char[]{'*','n','o','k','?'}, 0, 5);
		System.out.println(strb);
		
		//insert method
		strb = new StringBuilder("Shiver Me Timbers!");
		strb.insert(17, " and Bricks");
		System.out.println(strb);
		
		//delete method
		strb.delete(17,28); // delete " and Bricks"
		System.out.println(strb);
		
		//delete char at
		strb.deleteCharAt(17); // delete "!"
		System.out.println(strb);
		
		//reverse method
		strb = new StringBuilder("Shiver Me Timbers!");
		System.out.println(strb.reverse());
	}
}
