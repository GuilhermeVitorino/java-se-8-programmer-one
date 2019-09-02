package br.com.chap11.lambdaexpressions.certification;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlanetApp {

	public static void main(String[] args) {
		
		Planet mercury = new Planet("Mercury", Color.GRAY, 0, false);
		Planet venus = new Planet("Venus", Color.YELLOW, 0, false);
		Planet earth = new Planet("Earth", Color.BLUE, 1, false);
		Planet mars = new Planet("Mars", Color.RED, 2, false);
		Planet jupiter = new Planet("Jupiter", Color.YELLOW, 67, true);
		Planet saturn = new Planet("Saturn", Color.ORANGE, 62, true);
		Planet uranus = new Planet("Uranus", Color.CYAN, 27, true);
		Planet neptune = new Planet("Neptune", Color.BLUE, 14, true);

		List<Planet> planetList = new ArrayList<>();
		planetList.add(mercury);
		planetList.add(venus);
		planetList.add(earth);
		planetList.add(mars);
		planetList.add(jupiter);
		planetList.add(saturn);
		planetList.add(uranus);
		planetList.add(neptune);
		
		//scenario 1 - which planets have rings
		System.out.println("Has one or more rings: " + PlanetPredicates.filterPlanets(planetList, p -> p.isRinged()));
				
		//scenario 2 - which planets are blue and have moons
		System.out.print("Has blue and have moon: ");
		planetList.stream().filter(p -> p.getNumberOfMoons() > 0 & p.getPrimaryColor().equals(Color.BLUE))
			.forEach(s -> System.out.print(s + " "));
		//+ PlanetPredicates.filterPlanets(planetList, p -> p.getNumberOfMoons() > 1	&& p.getPrimaryColor().equals(Color.BLUE)));
		
		//scenario 3 - which planets have more than twenty moons?
		System.out.println("\nHas more than twenty moons: " + PlanetPredicates.filterPlanets(planetList, p -> p.getNumberOfMoons() > 20));
		
		//scenario 4 - which planets has a color (other than black)
		System.out.print("Has a color not black: ");
		planetList.stream().filter(PlanetPredicates.hasColor()).forEach(s -> System.out.print(s + " "));
		
		//scenario 5 - which planets have moons?
		System.out.print("\nHas one or more moons: ");
		planetList.removeIf(p -> p.getNumberOfMoons() == 0);
		System.out.print(planetList.toString());

	}

}
