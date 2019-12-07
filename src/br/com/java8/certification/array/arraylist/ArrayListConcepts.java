package br.com.java8.certification.array.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConcepts {
	
	public static void main(String[] args) {
		
		//ArrayList<int> intArrayList = new ArrayList<int>(); compilation error. ArrayList cannot store priitive variables
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(); //ArrayList can only store Wrappers of primitives
		
		ArrayList<Integer> intArrayList_2 = new ArrayList<>(); //ok. other syntax
		
		ArrayList<Integer> intArrayList_3 = new ArrayList<>(30); //ok. assigning size
		System.out.println(intArrayList_3.size()); //print 0. because none number was stored
		
		Integer[] integerList = {1,2,3}; //autoboxing
		List<Integer> intArrayList_4 = Arrays.asList(integerList);
		System.out.println(intArrayList_4); //print [1, 2, 3]
		
		//ArrayList<Integer> intArrayList_5 = Arrays.asList(integerList); //compile error. work just wheiter the assigned type is List
		
		//ArrayList<Integer> intArrayList_5 = intArrayList_4; //compile error. ArrayList cannot be assigned by List type (abstract Interface)
		
		//remove method
		ArrayList<String> arrayListStr = new ArrayList<String>();
		String str1 = new String("str1");
		String str2 = new String("str2");
		
		arrayListStr.add(str1);
		arrayListStr.add(str2);
		
		System.out.println(arrayListStr);
		System.out.println(str1.equals("str1")); //print true
		
		arrayListStr.remove("str1");
		System.out.println(arrayListStr);

		
		
		ArrayList<Car> arrayListCar = new ArrayList<Car>();
		
		Car car1 = new Car(200);
		Car car2 = new Car(200);
		
		arrayListCar.add(car1);
		arrayListCar.add(car2);
		
		System.out.println(arrayListCar);
		System.out.println(car1.equals(car2)); //print true. just whether "equals method" was implemented in class car to return true if maxSpeed are equals
		
		Car car3 = new Car(200);
		
		arrayListCar.remove(car3); //remove one just whether "equals method" was implemented in class car to return true if maxSpeed are equals
		System.out.println(arrayListCar); //print [200]
		
	}
		
}

class Car{
	
	
	public int maxSpeed;

	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		return String.valueOf(getMaxSpeed());
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		
		if (obj == null) return false;
		
		if (getClass() != obj.getClass()) return false;
		
		Car o = (Car) obj;
		
		return getMaxSpeed() == o.getMaxSpeed(); 
	}
	
}
