package br.com.chap11.lambdaexpressions.certification;

import java.awt.Color;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Planet {
	
	private String name = "Unknown";
	private Color primaryColor = Color.WHITE;
	private Integer numberOfMoons = 0;
	private Boolean ringed = false;
		
	public Planet(String name, Color primaryColor, Integer numberOfMoons, Boolean ringed) {
		super();
		this.name = name;
		this.primaryColor = primaryColor;
		this.numberOfMoons = numberOfMoons;
		this.ringed = ringed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getPrimaryColor() {
		return primaryColor;
	}
	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}
	public Integer getNumberOfMoons() {
		return numberOfMoons;
	}
	public void setNumberOfMoons(Integer numberOfMoons) {
		this.numberOfMoons = numberOfMoons;
	}
	public Boolean isRinged() {
		return ringed;
	}
	public void setRinged(Boolean ringed) {
		this.ringed = ringed;
	}
	public String toString() {
		return name;
	}
	
}

class PlanetPredicates { 
	public static Predicate<Planet> hasMoonMoreThan(Integer moons) {
		return p -> p.getNumberOfMoons() > moons;
	}
	
	public static Predicate<Planet> hasColor(){
		return p -> p.getPrimaryColor() != Color.BLACK;
	}
	
	public static List<Planet> filterPlanets(List<Planet> planetList, Predicate<Planet> predicate){
		return planetList.stream().filter(predicate).collect(Collectors.<Planet>toList());
	}
	
	public static StringBuilder listFilteredPlanets(List<Planet> planetList, Predicate<Planet> predicate){
		StringBuilder planets = new StringBuilder();
		planetList.stream().filter((planet) -> (predicate.test(planet))).forEach((planet) -> {
			planets.append(planet).append(" ");
		});
		
//		Alternate approach
//		for (planet : planetList) {
//			if (predicate.test(planet)) {
//				planets.append(planet).append(" ");
//			}
//		}
		
		return planets;
	}
}
