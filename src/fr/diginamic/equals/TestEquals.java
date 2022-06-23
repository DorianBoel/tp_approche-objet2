package fr.diginamic.equals;

import entities.City;
import entities.enums.Continent;

public class TestEquals {

	public static void main(String[] args) {
		
		City city1 = new City("Nice", 343_000, Continent.EUROPE);
		City city2 = new City("Nice", 343_000, Continent.EUROPE);
		
		System.out.println("city1 equals city2 ? " + city1.equals(city2));
		System.out.println();

		city2 = new City("Marseille", 850_700, Continent.EUROPE);
		
		System.out.println("city1 equals city2 ? " + city1.equals(city2));
		System.out.println();
		
	}

}
