package br.com.chap11.lambdaexpressions.certification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class WaterApp2 {
	
	public static void main(String[] args) {
		
		Water2 hardWater = new Water2("Hard");
		Water2 softWater = new Water2("Soft");
		Water2 boiledWater = new Water2("Boiled");
		Water2 rawWater = new Water2("Raw");
		Water2 rainWater = new Water2("Rain");
		Water2 snowWater = new Water2("Snow");
		Water2 filteredWater = new Water2("Filtered");
		Water2 reverseOsmosisWater = new Water2("ReverseOsmosis");
		Water2 deionizedWater = new Water2("Deionized");
		Water2 distilledWater = new Water2("Distilled");
		
		List<Water2> waterList = new ArrayList<>();
		waterList.add(hardWater);
		waterList.add(softWater);
		waterList.add(boiledWater);
		waterList.add(rawWater);
		waterList.add(rainWater);
		waterList.add(snowWater);
		waterList.add(filteredWater);
		waterList.add(reverseOsmosisWater);
		waterList.add(deionizedWater);
		waterList.add(distilledWater);
		
		System.out.println("Not Sorted: " + waterList);
		
		//inline anonymous inner class
		/*Comparator <Water2> waterSort2 = new Comparator<Water2>() {
			@Override
			public int compare(Water2 w1, Water2 w2) {
				return w1.getSource().compareTo(w2.getSource());
			}
		
		};*/
		
		//Comparator <Water2> waterSort2 = (w1, w2) -> w1.getSource().compareTo(w2.getSource());		
		
		//Collections.sort(waterList, (w1, w2) -> w1.getSource().compareTo(w2.getSource()));
		
		waterList.sort(Comparator.comparing(w -> w.getSource()));
		
		System.out.println("Sorted: " + waterList);

	}
}

class Water2 {
	private String source;

	public Water2(String source) {
		this.setSource(source);
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	public String toString() {
		return this.source ;
	}
}
