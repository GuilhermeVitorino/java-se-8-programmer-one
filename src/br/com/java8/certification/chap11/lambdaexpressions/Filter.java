package br.com.java8.certification.chap11.lambdaexpressions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		
		Shoe ricardoAlmeida = new Shoe(true,  new BigDecimal(2000));
		Shoe foo            = new Shoe(false, new BigDecimal( 100));
		
		List<Shoe> listShoes = new ArrayList<Shoe>();
		
		listShoes.add(ricardoAlmeida);
		listShoes.add(foo);
		
		listShoes.parallelStream().filter(s -> s.isBranded()).forEach(s -> System.out.println(s.getRetailPrice()));
	}
	
}

class Shoe {
	protected  boolean branded;
	protected  BigDecimal retailPrice;
	
	public Shoe(boolean branded, BigDecimal retailPrice) {
		this.branded = branded;
		this.retailPrice = retailPrice;
	}
	
	public boolean isBranded() {
		return branded;
	}
	
	public void setBranded(boolean branded) {
		this.branded = branded;
	}
	
	public BigDecimal getRetailPrice() {
		return retailPrice;
	}
	
	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}
	
	
}