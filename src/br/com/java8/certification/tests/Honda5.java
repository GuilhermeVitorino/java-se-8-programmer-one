package br.com.java8.certification.tests;

interface Bike4 {
	
	void runBike4();
	
	static void stop() {
		System.out.println("stop the bike");
	}
}

abstract class Bike3 {
	
	abstract void runB3();
	
	void stop() {
		System.out.println("stop the bike");
	}
}


abstract class Bike2 extends Bike3 implements Bike4{
	
	abstract void run();
	
	void stop() {
		System.out.println("stop the bike");
	}
}

public class Honda5 extends Bike2 {
	
	void run() {
		System.out.println("running safely..");
	}
		
	void stop() {
		System.out.println("also stop the bike!");
	}

	public static void main(String args[]) {
		Bike2 obj = new Honda5();
		obj.run();
		obj.stop();
	}

	@Override
	public void runBike4() {
		// TODO Auto-generated method stub
	}

	@Override
	void runB3() {
		// TODO Auto-generated method stub
		
	}
}
