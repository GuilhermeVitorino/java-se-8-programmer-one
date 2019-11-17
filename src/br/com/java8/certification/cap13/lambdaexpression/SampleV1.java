package br.com.cap13.lambdaexpression.certification;

import java.util.ArrayList;
import java.util.List;

interface Matcher<T>{
	boolean test(T t);
}

class AgeOfMajority implements Matcher<Person>{
	@Override
	public boolean test(Person p) {
		return p.getAge() >= 18;
	}
}

class PersonFilter{
	public List<Person> filter(List<Person> input, Matcher<Person> matcher){
		List<Person> output = new ArrayList<>();
		for (Person person : input) {
			if(matcher.test(person)) {
				output.add(person);
			}
		}
		return output;
	}
}

public class SampleV1 {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
		Person p1 = new Person("pessoa1", 17);
		Person p2 = new Person("pessoa2", 18);
		
		persons.add(p1);
		persons.add(p2);
		
		PersonFilter pf = new PersonFilter();
		List<Person> adults = pf.filter(persons, new AgeOfMajority());
		
		System.out.println(adults.size());
	}
}
