package br.com.java8.certification.operators;

public class Operators {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 20;
		int d = 25;
		int e = 30;

		
		a += 3;
		System.out.println("a += 3: " + a);
		
		b -= 3;
		System.out.println("b -= 3: " + b);
		
		c *= 3;
		System.out.println("c *= 20: " + c);
		
		d /= 3;
		System.out.println("d /= 3: " + d);
		
		e %= 3;
		System.out.println("d %= 3: " + e);
		
		
		a = 60; b = 13;
		/* binary AND operator copies a bit to the result if it exists in both operands.
		 * ex:
		 * 
		 * a = 0011 1100 (60)
		 * b = 0000 1101 (13)
		 * 
		 * (a & b) will give 12 which is 0000 1100
		 */
		a &= b;
		System.out.println("a &= b: " + a);
		
		
		a = 60; b = 13;
		/* binary XOR operator copies the bit if it is set in one operand but not both.
		 * ex:
		 * 
		 * a = 0011 1100 (60)
		 * b = 0000 1101 (13)
		 * 
		 * (a ^ b) will give 49 which is 0011 0001
		 */	
		a ^= b;
		System.out.println("a ^= b: " + a);
		
		
		a = 60; b = 13;
		/* binary OR operator copies a bit if it exists in either operand.
		 * ex:
		 * 
		 * a = 0011 1100 (60)
		 * b = 0000 1101 (13)
		 * 
		 * (a | b) will give 61 which is 0011 1101
		 */	
		a |= b;
		System.out.println("a |= b: " + a);
		
		
		a = 60;
		/* binary Left Shift operator. The left operands value is moved left by the number of bits specified by the right operand..
		 * ex:
		 * 
		 * a = 0011 1100 (60)
		 * 
		 * a << 2 will give 240 which is 1111 0000
		 */	
		a <<= 2;
		System.out.println("a <<= 2: " + a);
		
		
		a = 60;
		/* Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
		 * ex:
		 * 
		 * a = 0011 1100 (60)
		 * 
		 * a >> 2 will give 15 which is 1111
		 */
		a >>= 2;
		System.out.println("a <<= 2: " + a);
		
		
		a = 60;
		/* Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
		 * ex:
		 * 
		 * a = 0011 1100 (60)
		 * 
		 * a >> 2 will give 15 which is 1111
		 */
		a >>>= 2;
		System.out.println("a >>>= 2: " + a);
		
	}
	
}
