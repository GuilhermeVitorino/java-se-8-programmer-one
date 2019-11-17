package br.com.java8.certification.chap11.lambdaexpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class WaterApp {
	
	public static void main(String[] args) {
		
		Water hardWater = new Water("Hard");
		Water softWater = new Water("Soft");
		Water boiledWater = new Water("Boiled");
		Water rawWater = new Water("Raw");
		Water rainWater = new Water("Rain");
		Water snowWater = new Water("Snow");
		Water filteredWater = new Water("Filtered");
		Water reverseOsmosisWater = new Water("ReverseOsmosis");
		Water deionizedWater = new Water("Deionized");
		Water distilledWater = new Water("Distilled");
		
		List<Water> waterList = new ArrayList<>();
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
		
		WaterSort waterSort = new WaterSort();
		Collections.sort(waterList, waterSort);
		
		System.out.println("Sorted: " + waterList);

	}
}

class WaterSort implements Comparator <Water> {
	@Override
	public int compare(Water w1, Water w2) {
		return w1.getSource().compareTo(w2.getSource());
	}
}

class Water {
	private String source;

	public Water(String source) {
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
