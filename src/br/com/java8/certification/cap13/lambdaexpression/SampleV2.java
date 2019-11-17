package br.com.cap13.lambdaexpression.certification;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class PersonFilterV2{
	public List<Person> filter(List<Person> input, Predicate<Person> matcher){
		List<Person> output = new ArrayList<>();
		for (Person person : input) {
			if(matcher.test(person)) {
				output.add(person);
			}
		}
		return output;
	}
}

public class SampleV2 {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
		Person p1 = new Person("pessoa1", 17);
		Person p2 = new Person("pessoa2", 18);
		
		persons.add(p1);
		persons.add(p2);
		
		Predicate<Person> matcher =
				//(Person p) -> {return p.getAge() >= 18;};
				//(p) -> {return p.getAge() >= 18;};
				//p -> {return p.getAge() >= 18;};
				p -> p.getAge() >= 18;
				
		PersonFilterV2 pfV2 = new PersonFilterV2();
		List<Person> adults = pfV2.filter(persons, matcher);
		
		System.out.println(adults.size());
	}
}
