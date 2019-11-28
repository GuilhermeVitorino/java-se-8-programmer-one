package br.com.java8.certification.strings;

public class StringTests {
	public static void main(String[] args) {
		
		//compareTo method
		String eggs1 = "Cackle fruit";
		String eggs2 = "Cackle fruit";
		String eggs3 = "Cackle fruit***";
		String eggs4 = "Cackle fruit****";
		
		System.out.println(eggs1.compareTo(eggs2));
		System.out.println(eggs1.compareTo(eggs3)); // 3 character differents
		System.out.println(eggs1.compareTo(eggs4)); // 4 character differents
		
		StringBuilder strB = new StringBuilder("strB");
		String str = new String("strB");
		
		//String and StringBuilder are not comparable types
		System.out.println(strB.equals(str)); //false
		System.out.println(strB.toString().equals(str)); //true
	}
}
