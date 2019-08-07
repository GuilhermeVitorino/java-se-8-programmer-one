package br.com.cap9.thisandsuper.certification;

class Vehicle{
	double speed = 50;
}

class Car extends Vehicle {
	double speed = 50;
	void print() {
		System.out.println(speed);
		System.out.println(this.speed);
		System.out.println(super.speed);
	}
}


public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 1000;
		c.print();
		System.out.println();
		((Vehicle)c).speed = 9000; //change value of superclass member
		c.print();
	}
}
