package br.com.java8.certification.tests;

abstract class Bike {
	
	abstract void run();
	
	void stop() {
		System.out.println("stop the bike");
	}
}

public class Honda4 extends Bike {
	
	
	void run() {
		System.out.println("running safely..");
	}
		
	void stop() {
		System.out.println("also stop the bike!");
	}

	public static void main(String args[]) {
		Bike obj = new Honda4();
		obj.run();
		obj.stop();
	}
}
